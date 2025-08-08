package Exception;

class PrafulException extends RuntimeException {
    public PrafulException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j == 0) {
                throw new PrafulException("Answer can't be zero");
            }
        } catch(PrafulException e) {
            j = 18/1;
            System.out.println("The default output" + e);
        } catch(Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
