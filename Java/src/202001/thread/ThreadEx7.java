package thread;

import javax.swing.JOptionPane;


public class ThreadEx7 {
    public static void main(String args[]) {
        ThreadEx7_1 t1 = new ThreadEx7_1();
        t1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요"); // 입력 받을 때 출력도 동시에 가능함.
        System.out.printf("입력하신 값은 %s입니다", input);
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for(int i=10; i>0; i--) {
            System.out.println(i);

            try {
                sleep(1000);
            } catch (Exception e) {}
        }
    }
}
