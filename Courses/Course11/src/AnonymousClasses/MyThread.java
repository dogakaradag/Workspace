package AnonymousClasses;

public class MyThread implements Runnable{
    String name;

    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop::" + name + ": " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

            }
        }
    }
}
