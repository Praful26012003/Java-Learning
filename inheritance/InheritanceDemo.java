package inheritance;

class Calc {
    int a;
    String b;

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class ScientificCalc extends AdvCalc {
    public int getMod(int a, int b) {
        return a % b;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(10, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj.mul(10, 5);
        int r4 = obj.div(10, 5);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }
}
