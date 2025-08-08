package Abstraction;

abstract class Car {
    public abstract void drive();            // doesn't know the implementation of drive and i want the class that extends Car should
                                             //  implement that. So, in this case we make this drive() an abstract method
    public void playMusic() {
        System.out.println("play music....");
    }
}

class BMW extends Car {
    public void drive() {
       System.out.println("BMW driving");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car obj = new BMW();
        obj.drive();
        obj.playMusic();
    }
}
