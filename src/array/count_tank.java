package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class count_tank {
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
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count1 = 0, count2 = 0, count3 = 0;
            for (int i = 0; i <= n - 3; i++) {
                for (int j = 0; j <= n - 3; j++) {
                    if (i == 0 || j == 0 || i == n - 3 || j == n - 3 || (arr[i - 1][j - 1] == 0 && arr[i - 1][j] == 0 && arr[i - 1][j + 1] == 0 && arr[i - 1][j + 2] == 0 && arr[i - 1][j + 3] == 0 && arr[i][j + 3] == 0 && arr[i + 1][j + 3] == 0 && arr[i + 2][j + 3] == 0 && arr[i + 3][j + 3] == 0 && arr[i][j - 1] == 0 && arr[i + 1][j - 1] == 0 && arr[i + 2][j - 1] == 0 && arr[i + 3][j - 1] == 0 && arr[i + 3][j] == 0 && arr[i + 3][j + 1] == 0 && arr[i + 3][j + 2] == 0)) {
                        if ((arr[i][j] == 0 && arr[i][j + 1] == 1 && arr[i][j + 2] == 0 && arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i + 2][j] == 1 && arr[i + 2][j + 1] == 1 && arr[i + 2][j + 2] == 1) ||
                                (arr[i][j] == 1 && arr[i][j + 1] == 1 && arr[i][j + 2] == 0 && arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i + 2][j] == 1 && arr[i + 2][j + 1] == 1 && arr[i + 2][j + 2] == 0) ||
                                (arr[i][j] == 1 && arr[i][j + 1] == 1 && arr[i][j + 2] == 1 && arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i + 2][j] == 0 && arr[i + 2][j + 1] == 1 && arr[i + 2][j + 2] == 0) ||
                                (arr[i][j] == 0 && arr[i][j + 1] == 1 && arr[i][j + 2] == 1 && arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 1][j + 2] == 1 && arr[i + 2][j] == 0 && arr[i + 2][j + 1] == 1 && arr[i + 2][j + 2] == 1))
                            count1++;
                    }
                }
            }
            System.out.println(count1);
        }
    }
}
