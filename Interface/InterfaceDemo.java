package Interface;

interface A {
   String name = "Hyderabad";    // by default final and static
   void show();                  // by default public and abstract
   void config(); 
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
