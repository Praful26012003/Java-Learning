package FunctionalInterface;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void config(int n);
}

@FunctionalInterface
interface C {
    int run(int a, String b);
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {                                      // normal
                System.out.println("In obj show");
            }
        };
        obj.show();

        A obj1 = () -> System.out.println("in obj1 show");           // lambda expression
        obj1.show();

        B obj2 = (int num) -> System.out.println("in config " + num);   // lamda expression with input parameter
        obj2.config(10); 
        
        C obj3 = (a, b) -> {
                    System.out.println("number : " + a + ", name : " + b);
                    return a;
                };

        int num = obj3.run(10, "Praful");
        System.out.println(num);
    }    
}
