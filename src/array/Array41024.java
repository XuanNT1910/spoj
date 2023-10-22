package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41024 {
    static final int[] xK = {-2, -2, -1, -1, 1, 1, 2, 2};
    static final int[] yK = {-1, 1, -2, 2, -2, 2, -1, 1};
    static final int[] xQ = {-1, -1, -1, 0, 0, 1, 1, 1};
    static final int[] yQ = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int tc = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N, M;
            N = sc.nextInt();
            M = sc.nextInt();
            if (N == 0 || M == 0) break;
            int[][] a = new int[N + 1][M + 1];
            int sQ, sK, sP;
            int[][] vQ = new int[2][100];
            int[][] vK = new int[2][100];
            sQ = sc.nextInt();
            for (int i = 0; i < sQ; i++) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                a[x][y] = 1;
                vQ[0][i] = x;
                vQ[1][i] = y;
            }
            sK = sc.nextInt();
            for (int i = 0; i < sK; i++) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                a[x][y] = 2;
                vK[0][i] = x;
                vK[1][i] = y;
            }
            sP = sc.nextInt();
            for (int i = 0; i < sP; i++) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                a[x][y] = 3;
            }
            //quan hau
            for (int i = 0; i < sQ; i++) {
                int x = vQ[0][i];
                int y = vQ[1][i];
                for (int j = 0; j < 8; j++) {
                    for (int t = 1; ; t++) {
                        int dx = x + xQ[j] * t;
                        int dy = y + yQ[j] * t;
                        if (dx > 0 && dx <= N && dy > 0 && dy <= M && (a[dx][dy] == 0)) {
                            a[dx][dy] = 4;
                        } else break;
                    }

                }
            }
            //quan ma
            for (int i = 0; i < sK; i++) {
                int x = vK[0][i];
                int y = vK[1][i];
                for (int j = 0; j < 8; j++) {
                    int dx = x + xK[j];
                    int dy = y + yK[j];
                    if (dx > 0 && dx <= N && dy > 0 && dy <= M && a[dx][dy] == 0) {
                        a[dx][dy] = 3;
                    }
                }
            }
            //dem
            int res = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (a[i][j] == 0) {
                        res++;
                    }
                }
            }
            System.out.println("Board " + tc++ + " has " + res + " safe squares.");
        }
    }
}
