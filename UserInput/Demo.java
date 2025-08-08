package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);

    System.out.println("Please enter a number");
    // int num = Integer.parseInt(bf.readLine());

    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    System.out.println(num);

    sc.close();
    // bf.close();
    
  }  
}
