package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class string_41081 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        scanner.nextLine();
        for (int t = 1; t <= tc; t++) {
            String s = scanner.nextLine();
            int dem = 0;
            int maxdem = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    if (subString(s,i,j)) dem = j-i+1;
                    if (maxdem<dem) maxdem = dem;
                }
            }
            System.out.println("#"+t+" "+maxdem);
        }
    }

    private static boolean subString(String s, int i, int j) {
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
