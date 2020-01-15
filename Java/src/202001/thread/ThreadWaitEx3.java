//import java.util.ArrayList;
//
//public class ThreadWaitEx3 {
//    public static void main(String args[]) {
//        Table table = new Table(); // 공유하는 객체
//
//        new Thread(new Cook(table), "COOK1").start();
//        new Thread(new Customer(table, "donut"), "CUST1").start();
//        new Thread(new Customer(table, "burger"), "CUST2").start();
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//
//        System.exit(0);
//    }
//}
//
//class Customer implements Runnable {
//    private Table table;
//    private String food;
//
//    Customer(Table table, String food) {
//        this.table = table;
//        this.food = food;
//    }
//
//    public void run() {
//        while(true) {
//            try {
//                Thread.sleep(100); // 0.1초 기다림.
//            } catch (InterruptedException e) {
//            }
//
//            String name = Thread.currentThread().getName();
//
//            table.remove(food);
//            System.out.println(name + " ate a "+ food);
//        }
//    }
//}
//
//class Cook implements Runnable {
//    private Table table;
//
//    Cook(Table table) { this.table = table;}
//
//    public void run() {
//        while(true) {
//            int idx = (int)(Math.random() * table.dishNum());
//            table.add(table.dishNames[idx]);
//
//            try {Thread.sleep(10);} catch(InterruptedException e) {}
//        }
//    }
//}
//
//class Table {
//    String[] dishNames = {"donut", "donut", "burger"};
//    final int MAX_FOOD = 6; // 테이블에 놓을 수있는 음식 개수
//
//    private ArrayList<String> dishes = new ArrayList<>();
//
//    public synchronized void add(String dish) {
//        // 테이블에 음식을 놓음
//        while (dishes.size() >= MAX_FOOD) {
//            String name = Thread.currentThread().getName();
//            System.out.println(name + " is waiting ");
//            try {
//                wait(); // COOK을 기다리게함. 소비자가 음식을 먹어야하니까
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//            }
//        }
//
//        dishes.add(dish);
//        notify(); // CUST를 깨움.
//        System.out.println("Dishes:"+dishes.toString());
//    }
//
//    public void remove(String dishName) {
//        synchronized (this) {
//            String name = Thread.currentThread().getName();
//
//            while(dishes.size() == 0) { // 음식이 추가되었는지 확인함.
//                System.out.println(name+"is waiting");
//                try {
//                    wait(); // CUST를 기다리게 함. 음식이 추가되어야 하니까..
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                }
//            }
//
//           while(true) {
//               for(int i=0; i<dishes.size(); i++) {
//                   if(dishName.equals(dishes.get(i))) {
//                       dishes.remove(i);
//                       notify(); // Cook을 깨움 cook이 안깨어날 수도 있음
//                       return;
//                   }
//               }
//
//               System.out.println(name +" is waiting");
//               try {
//                   wait(); // CUST쓰레드 기다리게 함
//                   Thread.sleep(500);
//               } catch (InterruptedException e) {
//               }
//           }
//        }
//    }
////    public boolean remove(String dishName) {
////        for (int i=0; i<dishes.size(); i++) {
////            if (dishName.equals(dishes.get(i))) {
////                dishes.remove(i);
////                return true;
////            }
////        }
////
////        return false;
////    }
//
//    public int dishNum() { return dishNames.length;}
//}
