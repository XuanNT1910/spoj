package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41082 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            int count = 0;
            for (int i = x; i <= y; i++) {
                int cn = 0;
                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    if (isBeauti(digit, arr))
                        cn++;
                    num = num / 10;
                }
                if (cn >= m) {
                    count++;
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }

    private static boolean isBeauti(int num, int[] arr) {
        for (int i : arr) {
            if (num == i) return true;
        }
        return false;
    }
}
