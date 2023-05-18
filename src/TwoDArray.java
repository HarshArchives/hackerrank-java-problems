package src;

// {@author -> geekyharsh05}

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the sum of the current hourglass
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                // Update the maximum hourglass sum if needed
                maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
            }
        }

        System.out.println(maxHourglassSum);
    }
}
