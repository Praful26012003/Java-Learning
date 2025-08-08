package Interface;

interface A {
    void show();
    // void config();
}

interface B {
    // void show();
    void config();
}

interface C extends B {
    void run();
}

class D implements A,C{
    public void show() {
        System.out.println("in show");
    }

    public void run() {
        System.out.println("in run");
    }

    public void config() {
        System.out.println("in config");
    }
}


public class InterfaceDemoAgain {
    public static void main(String[] args) {
        A obj1 = new D();
        obj1.show();

        B obj2 = new D();
        obj2.config();
        // obj1.run();             // Reference A has no run method in it;

        C obj3 = new D();
        obj3.config();
        obj3.run();

    }
}
