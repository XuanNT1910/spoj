package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Array41032 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số lượng test cases

        for (int tc = 1; tc <= t; tc++) {
            int n = scanner.nextInt(); // Số lượng người trong hàng đợi
            int[] heights = new int[n];
            int[] tallerCount = new int[n];

            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                tallerCount[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (heights[i] > heights[j]) {
                        int tmp = heights[i];
                        heights[i] = heights[j];
                        heights[j] = tmp;
                        tmp = tallerCount[i];
                        tallerCount[i] = tallerCount[j];
                        tallerCount[j] = tmp;
                    }
                }
            }

            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                int count = tallerCount[i];
                for (int j = 0; j < n; j++) {
                    if (result[j] == 0) {
                        if (count == 0) {
                            result[j] = heights[i];
                            break;
                        } else count--;
                    }
                }
            }

            // In ra kết quả
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
