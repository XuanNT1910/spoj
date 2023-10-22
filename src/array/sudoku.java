package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sudoku {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            char[][] arr = new char[9][9];
            for (int i = 0; i < 9; i++) {
                String s = sc.next();
                arr[i] = s.toCharArray();
            }
            boolean isValid = isSudoku(arr);

            System.out.println("#" + t + " " + (isValid ? 1 : 0));
        }
    }

    private static boolean isSudoku(char[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = arr[i][j];
                if (current == '.') continue;

                for (int k = 0; k < 9; k++) {
                    if (k != j && arr[i][k] == current) return false;
                }
                for (int k = 0; k < 9; k++) {
                    if (k != i && arr[k][j] == current) return false;
                }
                int a = (i / 3) * 3;
                int b = (j / 3) * 3;
                for (int k = a; k < a + 3; k++) {
                    for (int l = b; l < b + 3; l++) {
                        if (k != i && l != j && arr[k][l] == current) return false;
                    }
                }
            }
        }
        return true;
    }
}
