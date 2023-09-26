package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41074 {
    public static int solve(int[] A, int N, int[] arr) {
        for (int i = 0; i < N; i++) {
            if (A[arr[i]] == 1) {
                return arr[i];
            }
            A[arr[i]] += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int[] A = new int[100001];
            int result = solve(A, N, arr);
            System.out.println("#" + tc + " " + result);
        }
    }
}
