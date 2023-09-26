package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41079 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int N, M, K;
            N = sc.nextInt();
            M = sc.nextInt();
            K = sc.nextInt();
            int sum, res = 0, x = 0, y = 0;
            int min = 999999999;
            int[][] A = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    sum = 0;
                    for (int i1 = 0; i1 < M; i1++) {
                        for (int j1 = 0; j1 < M; j1++) {
                            sum = sum + A[i + i1][j + j1];
                        }
                    }
                    int xsum = sum - K;
                    if (xsum < 0) xsum = xsum * (-1);
                    if (xsum < min) {
                        res = sum;
                        min = xsum;
                        x = i;
                        y = j;
                    } else if (xsum == min) {
                        if (sum < res) {
                            res = sum;
                            x = i;
                            y = j;
                        }
                    }
                }
            }
            System.out.print("#" + t + " " + x + " " + y);
        }
        System.out.println();
    }

}
