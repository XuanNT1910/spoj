package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41076 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số test case

        for (int testCase = 1; testCase <= numTestCases; testCase++) {
            char[][] sudoku = new char[9][9];
            for (int i = 0; i < 9; i++) {
                String row = scanner.nextLine();
                sudoku[i] = row.toCharArray();
            }

            boolean isValid = isSudokuValid(sudoku);

            System.out.println("#" + testCase + " " + (isValid ? 1 : 0));
        }
    }

    // Hàm kiểm tra tính đúng đắn của Sudoku
    public static boolean isSudokuValid(char[][] sudoku) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char currentChar = sudoku[row][col];

                if (currentChar == '.') {
                    continue; // Nếu là dấu chấm thì bỏ qua
                }

                // Kiểm tra hàng ngang
                for (int i = 0; i < 9; i++) {
                    if (i != col && sudoku[row][i] == currentChar) {
                        return false;
                    }
                }

                // Kiểm tra cột dọc
                for (int i = 0; i < 9; i++) {
                    if (i != row && sudoku[i][col] == currentChar) {
                        return false;
                    }
                }

                // Kiểm tra ma trận con 3x3
                int startRow = (row / 3) * 3;
                int startCol = (col / 3) * 3;
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startCol; j < startCol + 3; j++) {
                        if (i != row && j != col && sudoku[i][j] == currentChar) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
