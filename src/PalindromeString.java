package src;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String R = new StringBuilder(A).reverse().toString();
        if (A.equals(R))
            System.out.println(A + " YES");
        else
            System.out.println(A + " NO");
        sc.close();
    }
}
