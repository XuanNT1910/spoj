package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41031 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    if (Math.abs(numbers[j]-numbers[l])==k)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
