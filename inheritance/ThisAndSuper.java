package inheritance;

class A {
    public A() {
        super();  //hidden
        System.out.println("in default A");
    }

    public A(int n) {
        super();  //hidden
        System.out.println("In parametrized A");
    }
}

class B extends A {
    public B() {
        super(5);   //hidden
        System.out.println("in default B");
    }

    public B(int n) {
        super();  //hidden
        System.out.println("In parametrized B");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}
