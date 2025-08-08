package Threads;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.NORM_PRIORITY);
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        obj1.start();
        obj2.start();
    }
}
