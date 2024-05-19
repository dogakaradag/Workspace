package AnonymousClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Thread t1 = new Thread(new MyThread("T1"));
        Thread t2 = new Thread(new MyThread("T2"));

        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello World");
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });

        t3.start();
    }
}
