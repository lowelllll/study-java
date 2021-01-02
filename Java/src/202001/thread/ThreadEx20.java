public class ThreadEx20 {
    public static void main(String args[]) {
        // 가비지 컬렉터 흉내내버깅
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;

        for(int i=0; i < 20; i++) {
            requiredMemory = (int) (Math.random() * 10) * 20;

            if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
                gc.interrupt(); // gc가 일어나도록
                try {
                    gc.join(100); // gc가 0.1초동안 수행될 수 있도록 기다림.
                } catch (InterruptedException e) {
                }
            }

            gc.usedMemory += requiredMemory; // gc가 실행되기도 전에 추가된다.
            System.out.println("usedMemory: "+gc.usedMemory);
        }
    }
}

class ThreadEx20_1 extends Thread {
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    public void run() {
        while(true) {
            try {
                Thread.sleep(10 * 1000); // 10초에 한번 가비치컬렉션을 수행함.
            } catch (InterruptedException e) {
                System.out.println("Awaken by interrupt()");
            }

            System.out.println("Garbage Collected used Memory:"+usedMemory); // 잔여 메모리

            gc();
            System.out.println("Garbage Collected Free Memory:"+freeMemory()); // 잔여 메모리
        }
    }

    public void gc() {
        usedMemory -= 300;
        if (usedMemory < 0) usedMemory = 0;
    }

    public int totalMemory() { return MAX_MEMORY; }
    public int freeMemory() { return MAX_MEMORY - usedMemory; }
}
