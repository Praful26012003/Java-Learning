class Calculator {
    int num = 5;

    public int add(int n1, int n2) {
        System.out.println("In first method");
        return n1 + n2;
    }

    public double add(double n1, double n2) {
        System.out.println("In second method");
        return n1 + n2;
    }


}

public class MethodOverloading {
   public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        int num1 = 5;
        int num2 = 6;

        cal1.num = 10;
        int result = cal1.add(num1, num2);

        System.out.println(cal1.num + " " + cal2.num);

   } 
}