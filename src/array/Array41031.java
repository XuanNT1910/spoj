package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Array41031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            Arrays.sort(numbers); // Sắp xếp mảng
            int count = 0;
            for (int i = 0; i < n; i++) {
                int target = numbers[i] + k;
                int left = i + 1;
                int right = n - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (numbers[mid] == target) {
                        count++;
                        break;
                    } else if (numbers[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
