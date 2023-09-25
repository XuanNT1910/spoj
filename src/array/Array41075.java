package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41075 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n, m1, m2;
            n = sc.nextInt();
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            int[] kl = new int[n];
            for (int i = 0; i < n; i++) {
                kl[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (kl[i] < kl[j]) {
                        int tmp = kl[i];
                        kl[i] = kl[j];
                        kl[j] = tmp;
                    }
                }
            }
            int cost = 0;
            int cnt = 0;
            int i = 1;
            int j = 1;
            while (cnt < n) {
                if (i <= m1) {
                    cost += kl[cnt++] * i++;
                }
                if (j <= m2) {
                    cost += kl[cnt++] * j++;
                }
            }
            System.out.println("#" + t + " " + cost);
        }
    }
}
