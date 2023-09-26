package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array41077 {
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        for (int testCase = 1; testCase <= numTestCases; testCase++) {
            int N = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int result = countObstacles(matrix, x, y);
            System.out.println("#" + testCase + " " + result);
        }
    }

    static int countObstacles(int[][] matrix, int x, int y) {
        int count = 0;
        int N = matrix.length;

        while (true) {
            int minHeight = matrix[x][y];
            int nextX = x;
            int nextY = y;

            for (int i = 0; i < 8; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newX < N && newY >= 0 && newY < N && matrix[newX][newY] < minHeight) {
                    minHeight = matrix[newX][newY];
                    nextX = newX;
                    nextY = newY;
                }
            }

            if (nextX == x && nextY == y) {
                break;
            }

            count++;
            x = nextX;
            y = nextY;
        }

        return count;
    }
}
