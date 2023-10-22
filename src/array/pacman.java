package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pacman {
    static final int[] xHuong = {-1, 0, 1, 0};
    static final int[] yHuong = {0, 1, 0, -1};
    static int N, M;
    static long sumM, sumC;
    static int[][] arr;
    static String s1, s2;

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            N = sc.nextInt();
            M = sc.nextInt();
            arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            s1 = sc.next();
            s2 = sc.next();
            sumM = arr[0][0];
            sumC = arr[N - 1][N - 1];
//            for (int i = 0; i < M; i++) {
//                System.out.print(s1.charAt(i));
//            }
//            System.out.println();
            tinhtoan(0, 2, 0, 0, 0, N - 1, N - 1);
            System.out.println("#" + t + " " + sumM + " " + sumC);
        }
    }

    private static void tinhtoan(int k, int huongM, int xM, int yM, int huongC, int xC, int yC) {
        if (k == M ) return;

        if (s1.charAt(k) == 'C') {
            xM = xM + xHuong[huongM];
            yM = yM + yHuong[huongM];
        } else if (s1.charAt(k) == 'L') {
            huongM = (huongM + 3) % 4;
            xM = xM + xHuong[huongM];
            yM = yM + yHuong[huongM];
        } else if (s1.charAt(k) == 'R') {
            huongM = (huongM + 1) % 4;
            xM = xM + xHuong[huongM];
            yM = yM + yHuong[huongM];
        }

        if (s2.charAt(k) == 'C') {
            xC = xC + xHuong[huongC];
            yC = yC + yHuong[huongC];
        } else if (s2.charAt(k) == 'L') {
            huongC = (huongC + 3) % 4;
            xC = xC + xHuong[huongC];
            yC = yC + yHuong[huongC];
        } else if (s2.charAt(k) == 'R') {
            huongC = (huongC + 1) % 4;
            xC = xC + xHuong[huongC];
            yC = yC + yHuong[huongC];
        }

        if (xM == xC && yM == yC) return;
        sumM = sumM + arr[xM][yM];
        arr[xM][yM] = 0;
        sumC = sumC + arr[xC][yC];
        arr[xC][yC] = 0;
        tinhtoan(k + 1, huongM, xM, yM, huongC, xC, yC);
    }
}
