package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview41052 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 1; i <= tc; i++) {
            int sum = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 1; j <= b; j++) {
                sum *= a;
            }
            System.out.println("#" + i + " " + sum);
        }

    }
}
