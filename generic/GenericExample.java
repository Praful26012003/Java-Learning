package generic;

class Animal {
    public void walk() {
        System.out.println("Animal Walk");
    }
}

class Cat extends Animal {
    public void walk() {
        System.out.println("Cat Walk");
    }
}

class Dog extends Animal {
    // public void walk() {
    //     System.out.println("Dog Walk");
    // }
}

class PrintAnyThing<T extends Animal> {
    T thing;

    public PrintAnyThing(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(thing+"!");
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // PrintAnyThing<Integer> obj1 = new PrintAnyThing<>(5);
        // obj1.print();
        // PrintAnyThing<String> obj2 = new PrintAnyThing<>("Praful");
        // obj2.print();
        // PrintAnyThing<Double> obj3 = new PrintAnyThing<>(5.3);
        // obj3.print();
        PrintAnyThing<Cat> obj4 = new PrintAnyThing<>(new Cat());
        obj4.thing.walk();
        PrintAnyThing<Dog> obj5 = new PrintAnyThing<>(new Dog());
        obj5.thing.walk();
        PrintAnyThing<Animal> obj6 = new PrintAnyThing<>(new Animal());
        obj6.thing.walk();

        printTwoThings("Praful", 24);
    }
    
    public static <T,V> void printTwoThings(T first, V second) {
        System.out.println(first + " : " + second);
    }
}
