class Cons {
    int a;
    int b;

    public Cons() {
        System.out.println("Inside default constructor");
    }

    public Cons(int a) {
        System.out.println("Inside parametrized constructor - a");
    }

    public Cons(int a, int b) {
        System.out.println("Inside parametrized constructor - a,b");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Cons obj1 = new Cons();
        Cons obj2 = new Cons(4);
        Cons obj3 = new Cons(4,5);
    }
}
