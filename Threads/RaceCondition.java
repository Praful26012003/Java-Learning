package Threads;

class A {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();

        Runnable obj1 = new Runnable () {
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    obj.increment();
                }
            }
        };

        Runnable obj2 = new Runnable () {
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    obj.increment();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();    // to start the execution of the thread
        t2.start();    // to start the execution of the thread

        t1.join();    // main will wait for t2 to complete the execution
        t2.join();    // main will wait for t2 to complete the execution

        System.out.println(obj.count);

    }
}
