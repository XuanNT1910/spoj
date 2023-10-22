package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class string_id41065 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int tc = 10;
        for (int t = 1; t <= tc; t++) {
            scanner.nextLine();
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            int a = s1.length();
            int b = s2.length();

            int dem2 = 0;
            for (int i = 0; i <= b-a; i++) {
                int dem = 0;
                for (int j = 0; j < a; j++) {
                    if (s2.charAt(i+j) == s1.charAt(j)) dem++;
                }
                if (dem == a) dem2++;
            }
            System.out.println("#"+t+" "+dem2);
        }
    }
}
