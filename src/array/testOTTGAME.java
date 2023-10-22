package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testOTTGAME {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int N, Q;
            N = sc.nextInt();
            Q = sc.nextInt();
            int[][] arr = new int[Q][N];
            for (int i = 0; i < Q; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int[] dem = new int[N];
            for (int i = 0; i < Q; i++) {
                boolean s1 = false;
                boolean s2 = false;
                boolean s3 = false;
                for (int j = 0; j < N; j++) {
                    if (dem[j] == -1) arr[i][j] = 0;
                    if (arr[i][j] == 1) {
                        s1 = true;
                    } else if (arr[i][j] == 2) {
                        s2 = true;
                    } else if (arr[i][j] == 3) {
                        s3 = true;
                    }
                }
                for (int j = 0; j < N; j++) {
                    if (s1 && s2 && !s3) {
                        if (arr[i][j] == 1) dem[j] = -1;
                    }
                    if (s2 && s3 && !s1) {
                        if (arr[i][j] == 2) dem[j] = -1;
                    }
                    if (s3 && s1 && !s2) {
                        if (arr[i][j] == 3) dem[j] = -1;
                    }
                }
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < N; i++) {
                if (dem[i] != -1)
                    System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
