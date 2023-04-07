package src;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Write your code here.
        sc.close();
        s = s.trim();

        /* Checking special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");

        /* Print result */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
