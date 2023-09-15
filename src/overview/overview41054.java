package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview41054 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số lượng test case
        for (int i = 1; i <= t; i++) {
            int a = scanner.nextInt(); // Giá trị a
            int b = scanner.nextInt(); // Giá trị b
            System.out.printf("#%d", i); // In số thứ tự của test case
            boolean hasPerfectSquare = false;
            for (int num = a; num <= b; num++) {
                int sqrtNum = (int) Math.sqrt(num);
                if (sqrtNum * sqrtNum == num) {
                    System.out.printf(" %d", num); // In số chính phương
                    hasPerfectSquare = true;
                }
            }
            if (!hasPerfectSquare) {
                System.out.print(" NO NUMBER"); // Nếu không có số chính phương nào
            }
            System.out.println(); // Xuống dòng cho test case tiếp theo
        }
    }
}
