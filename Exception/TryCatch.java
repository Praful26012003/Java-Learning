package Exception;

public class TryCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        try {
            j = 18/i;        
            System.out.println("Hello");    
            System.out.println(arr[2]);       
            System.out.println("Try Block Completed");    
        } catch(ArithmeticException e) {
            System.out.println("Can't be divided by zero...");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index u r trying to reach is out of bound");
        }
        catch(Exception e) {
            System.out.println("Something went wrong...." + e);    
        }

        System.out.println(j);     
        System.out.println("Bye");  
    }
}
