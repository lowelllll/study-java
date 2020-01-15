public class ThreadEx22 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return this.balance;
    }

    public synchronized void withdraw(int money) { // syncronized 메서드
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            balance -= money;
        }
    }
}

class RunnableEx22 implements Runnable {
    Account account = new Account();

    public void run() {
        while(account.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("balance:"+account.getBalance());
        }
    }
}
