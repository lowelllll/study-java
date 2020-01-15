public class ThreadEx18 {
    public static void main(String args[]) {
        ThreadEx18_1 th1 = new ThreadEx18_1("*");
        ThreadEx18_1 th2 = new ThreadEx18_1("**");
        ThreadEx18_1 th3 = new ThreadEx18_1("***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {
        }
    }
}

class ThreadEx18_1 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    ThreadEx18_1(String name) {
        th = new Thread(this, name);
    }

    public void run() {
        String name = th.getName();

        while(!stopped) {
            if(!suspended) {
                System.out.println(name);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

            } else {
                Thread.yield(); // 다른 쓰레드에게 양보함.
            }
        }

        System.out.println(name + "- stopped");
    }

    public void suspend() { // 쓰레드를 멈춤
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() +"- interrupt() by suspend()");
    }

    public void resume() {  // 중지된 쓰레드를 다시 실행 대기상태로 옮김.
        suspended = false;
    }

    public void stop() {
        stopped = true;
        th.interrupt(); //sleep중에도 interrupt가 바로 일어나서 응답이 빨라진다.
        System.out.println(th.getName() +"- interrupt() by stop()");
    }

    public void start() {
        th.start();
    }
}
