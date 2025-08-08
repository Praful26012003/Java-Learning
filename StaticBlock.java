class StaticDemo {
    String brand;
    int price;
    static String phone;

    static {
        phone = "SmartPhone";
        System.out.println("in static block");
    }

    public void show() {
        System.out.println(brand + " " + price + " " + phone);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.brand = "Apple";
        obj1.price = 15000;

        StaticDemo obj2 = new StaticDemo();
        obj2.brand = "Samsung";
        obj2.price = 14000;

        obj1.show();
        obj2.show();
    }
}
