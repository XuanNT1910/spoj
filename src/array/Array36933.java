package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array36933 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            sc.nextLine();
            char[][] a = new char[5 * m + 1][5 * n + 1];
            for (int j = 0; j < 5 * m + 1; j++) {
                String s = sc.nextLine();
                a[j] = s.toCharArray();
            }
            int[] res = new int[5];
            for (int i = 1; i < 5 * m + 1; i += 5) {
                for (int j = 1; j < 5 * n + 1; j += 5) {
                    int count = 0;
                    for (int k = 0; k < 5; k++) {
                        if (a[k + i][j] == '*') {
                            count++;
                        }
                    }
                    res[count]++;
                }
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < 5; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
