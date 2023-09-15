package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview41014 {
    public static boolean convert(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int m, n;
        for (int i = 1; i <= tc; i++) {

            m = sc.nextInt();
            n = sc.nextInt();
            for (int j = m; j <= n; j++) {
                if (convert(j)) {
                    System.out.println(j);

                }
            }
            System.out.println("\n");

        }
    }
}
