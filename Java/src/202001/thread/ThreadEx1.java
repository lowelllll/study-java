package thread;

public class ThreadEx1 {
    public static void main(String args[]) {
        ThreadEx1_1 t1 = new ThreadEx1_1("runnable 1");

        Runnable r = new ThreadEx1_2(); // 업캐스팅
        Thread t2 = new Thread(r, "runnable 2");

        t1.start(); // 한번만 호출할 수 있음.
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public ThreadEx1_1 (String name) {
        super(name);
    }

    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(getName()); // Thread의 getName()
        }
    }
}

class ThreadEx1_2 implements Runnable { // 일반적인 쓰레드 구현 방법 재사용성이 높고 코드의 일관성을 유지할 수 있음
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행중인 Thread를 반환함
        }
    }
}
