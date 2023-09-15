package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview15708 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int x, y, n;
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = x; j < n; j += x) {
                if (j % y != 0) {
                    System.out.print(j + " " );
                }
            }
            System.out.println("\n");
        }
    }
}
