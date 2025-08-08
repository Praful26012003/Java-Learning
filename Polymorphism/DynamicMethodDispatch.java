package Polymorphism;

class A {
    public void show() {
        System.out.println("in A show");
    }

    public void config1() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }

    public void config2() {
        System.out.println("in B config");
    }
      
}

class C extends B {
    public void show() {
        System.out.println("in C show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // obj.config1();
        // obj.config2();

        obj = new B();
        obj.show();
        // obj.config1();
        // obj.config2();

        obj = new C();
        obj.show();
        // obj.config1();
        // obj.config2();

        B obj1 = new C();
        obj1.show();
        // obj1.config1();
        // obj1.config2();
    }
}
