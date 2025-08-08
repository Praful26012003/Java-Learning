package Exception;

class ThrowsDemo {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
