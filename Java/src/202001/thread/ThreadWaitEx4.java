import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx4 {
    public static void main(String args[]) {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        try {
            Thread.sleep(2000);
            System.exit(0);
        } catch (InterruptedException e) {
        }
    }
}


class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(100); // 0.1초 기다림.
            } catch (InterruptedException e) {
            }

            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a "+ food);
        }
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}


class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6; // 테이블에 놓을 수있는 음식 개수
    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();

    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();
    private Condition forDonutCust = lock.newCondition();
    private Condition forBurgerCust = lock.newCondition();


    public void add(String dish) {
        lock.lock(); // lock을 검

        // 테이블에 음식을 놓음
        try {
            while (dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting ");
                try {
                    forCook.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            dishes.add(dish);
//            forCust.signal();

            if(dish.equals("burger")) {
                forBurgerCust.signal();
            } else {
                forDonutCust.signal();
            }

            System.out.println("Dishes:" + dishes.toString());
        } finally {
            lock.unlock();
        }
    }

    public void remove(String dishName) {
        lock.lock();

        String name = Thread.currentThread().getName();

        try {
            while (dishes.size() == 0) { // 음식이 추가되었는지 확인함.
                System.out.println(name + "is waiting");
                try {
                    forDonutCust.await();
                    forBurgerCust.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        forCook.signal();// Cook을 깨움 cook이 안깨어날 수도 있음
                        return;
                    }
                }

                System.out.println(name + " is waiting");
                try {
                    if(dishName.equals("burger")){
                        forBurgerCust.await();
                    } else {
                        forDonutCust.await();
                    }
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}

