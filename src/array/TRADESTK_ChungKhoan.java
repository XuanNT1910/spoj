package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TRADESTK_ChungKhoan {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int N, M;

            N = sc.nextInt();
            M = sc.nextInt();
            int abc = M;
            int[] arr = new int[N];

            int ck = 0, sodu = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < N - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    if (M > 0) {
                        ck = M / arr[i];
                        sodu = M % arr[i];
                        M = 0;
                    }
                }
                if (arr[i] > arr[i + 1]) {
                    if (ck > 0) {
                        M = ck * arr[i] + sodu;
                        ck = 0;
                        sodu = 0;
                    }
                }
            }
            if (M == 0) {
                M = ck * arr[N - 1] + sodu;
                ck = 0;
                sodu = 0;
            }
            M = M - abc;
            System.out.println("#" + t + " " + M);
        }
    }
}
