package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array36961 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int h, w, m, n;
        int[][] matran;
        for (int i = 1; i <= tc; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            m = sc.nextInt();
            n = sc.nextInt();
            matran = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    matran[j][k] = sc.nextInt();
                }
            }
            int max = maxSumOfBoudary(matran, h, w, m, n);

            System.out.println("#" + i + " " + max);

        }

    }

    private static int maxSumOfBoudary(int[][] matran, int h, int w, int m, int n) {
        int maxSum = 0;
        int[][] matrancon = new int[h][w];
        for (int i = 0; i <= m - h; i++) {
            for (int j = 0; j <= n - w; j++) {
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        matrancon[k][l] = matran[k + i][l + j];
                    }
                }
                int sum = sumOfBoudary(matrancon, h, w);
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    private static int sumOfBoudary(int[][] matran, int h, int w) {
        int sum = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
                    if (matran[i][j] % 2 == 0)
                        sum += matran[i][j];
            }
        }
        return sum;
    }
}
