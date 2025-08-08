package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a number");
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }  
    }
}
