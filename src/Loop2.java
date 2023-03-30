package src;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int calc = a;
            for (int j = 0; j < n; j++) {
                calc += (Math.pow(2, j) * b);
                System.out.print(calc + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
