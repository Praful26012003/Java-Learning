package Enum;

enum Laptop { // here, laptop is a class
    Macbook(80000), HP(60000), Dell, Acer(50000); // here, these are the four objects called name constants

    int price;
    
    private Laptop() {
        price = 20000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;

        // System.out.println(lap);

        Laptop[] laptops = Laptop.values();     // Every enum in java extends the Enum class
        for(Laptop laptop : laptops) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
