package src;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + (i * N));
        }
        sc.close();
    }
}
