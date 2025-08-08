class A {
    public void config() {
        System.out.println("In A config");
    }
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show() {
                System.out.println("In new show");
            }
        };
        obj.show();    // it will print the override method "in new show"
        obj.config();   // it will print the parent method of A
    }
}
