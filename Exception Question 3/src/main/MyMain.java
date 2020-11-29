package main;
import java.util.Scanner;
// Handling all the Exceptions while entering any value
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        try {
            number = sc.nextInt();
            System.out.println("Successfully Entered! "+number);
        } catch(Exception e) {
            System.out.println("Exception Occurred "+e.getStackTrace());
        }
    }
}
