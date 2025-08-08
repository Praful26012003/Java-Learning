class StaticDemo {
    String brand;
    int price;
    static String phone;

    public void show() {
        System.out.println(brand + " " + price + " " + phone);
    }

    public static void show1(StaticDemo obj) {
        System.out.println(obj.brand + " " + obj.price + " " + phone);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        obj.brand = "Apple";
        obj.price = 15000;
        StaticDemo.phone = "SmartPhone";

        obj.show();
    }
}

