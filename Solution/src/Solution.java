import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i = scan.nextInt();
        System.out.println("Enter a double");
        double d = scan.nextDouble();
        System.out.println("Enter a string");
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}