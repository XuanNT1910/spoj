package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array37046 {
    static int T, M, N;
    static final int MAX_SIZE = 101;
    static char[][] arr = new char[MAX_SIZE][MAX_SIZE];
    static int[][] mark = new int[MAX_SIZE][MAX_SIZE];

    public static void readData(Scanner sc) {
        for (int i = 0; i < M; i++) {
            String row = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = row.charAt(j);
                if (arr[i][j] == 'H') {
                    mark[i][j] = 1;
                } else {
                    mark[i][j] = 0;
                }
            }
        }
    }

    public static void mark(int r, int c, int step) {
        for (int i = 1; i <= step; i++) {
            if (r - i >= 0) mark[r - i][c] = 0;
            if (r + i < M) mark[r + i][c] = 0;
            if (c - i >= 0) mark[r][c - i] = 0;
            if (c + i < N) mark[r][c + i] = 0;
        }
    }

    public static int sum() {
        int s = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                s += mark[i][j];
            }
        }
        return s;
    }

    public static int solve() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int step = 0;
                if (arr[i][j] == 'A') {
                    step = 1;
                } else if (arr[i][j] == 'B') {
                    step = 2;
                } else if (arr[i][j] == 'C') {
                    step = 3;
                }
                if (step > 0) {
                    mark(i, j, step);
                }
            }
        }
        return sum();
    }

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            M = sc.nextInt();
            N = sc.nextInt();
            readData(sc);
            System.out.println("#" + tc + " " + solve());
        }
    }
}
