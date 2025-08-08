class A {
    int age;

    public void show() {
        System.out.println("in A show");
    }

    class B {
        public void config() {
            System.out.println("Configuring the age");
        }
    }

    static class C {
        public void fly() {
            System.out.println("i am flying");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        A objA = new A();
        objA.show();
        
        A.B objB = objA.new B();     // for non-static class
        objB.config();

        A.C objC = new A.C();       // for static class, as static class can be called with the class name
        objC.fly();
    }
}
