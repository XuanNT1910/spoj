package array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            String inputString = scanner.next();
            String numberString = inputString.replace(".", "");
            try {
                numbers[i] = Long.parseLong(numberString);
            } catch (NumberFormatException e) {
                System.err.println("Không thể chuyển đổi thành số nguyên.");
                return;
            }
            System.out.println("số thứ "+(i+1)+" là: "+numbers[i]);
        }

        // Tính tổng các số trong mảng
        long sum = 0;
        for (long num : numbers) {
            sum += num;
        }

        System.out.println("Tổng của mảng là: " + sum);
    }
}
