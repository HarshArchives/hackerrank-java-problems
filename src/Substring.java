package src;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String S1 = S.substring(start, end);
        System.out.println(S1);
        sc.close();
    }
}