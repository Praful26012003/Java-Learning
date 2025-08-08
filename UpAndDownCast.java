class Parent {
    public void show1() {
        System.out.println("in Parent show");
    }
}

class Child extends Parent {
    public void show2() {
        System.out.println("in Child show");
    }
}

public class UpAndDownCast {
    public static void main(String[] args) {

        Parent obj = (Parent) new Child();    // upcasting
        obj.show1();

        Child obj1 = (Child) obj;
        // obj1.show1();            // downcasting
        obj1.show2();
    }
}
