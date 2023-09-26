package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41078 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int[][] matran = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matran[i][j] = sc.nextInt();
                }
            }
            boolean isSymmetric = isLogoSymmetric(matran, n);

            System.out.println("#" + t + " " + (isSymmetric ? "YES" : "NO"));
        }
    }

    private static boolean isLogoSymmetric(int[][] matran, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                // Kiểm tra đối xứng qua trục Y
                if (matran[i][j] != matran[n - 1 - i][j]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Kiểm tra đối xứng qua trục X
                if (matran[i][j] != matran[i][n - 1 - j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
