package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SPATHP_GiaoHangNhanh {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 1; t <= tc; t++) {
            int N;
            N = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            int[] dem = new int[N];
            int x = 0;
            for (int i = 0; i < N; i++) {
                int abc = 0;
                for (int j = 0; j < N; j++) {
                    if (dem[j] == 1) abc++;
                }
                if (abc == N - 1) break;
                int min = Integer.MAX_VALUE;
                if (i == x) {
                    for (int j = 0; j < N; j++) {
                        if (arr[i][j] != 0 && arr[i][j] < min && dem[j] != 1) {
                            min = arr[i][j];
                            dem[i] = 1;
                            x = j;
                        }

                    }
                    sum = sum + min;
                }
            }
            System.out.println(sum + arr[x][0]);
        }
    }
}
