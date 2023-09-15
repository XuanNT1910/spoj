package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview41053 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Số lượng test case

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt(); // Số cần tính căn bậc hai
            int sqrtN = (int) Math.sqrt(n); // Tính căn bậc hai và chuyển thành số nguyên

            System.out.printf("#%d %d%n", i, sqrtN); // In kết quả theo định dạng
        }
    }
}
