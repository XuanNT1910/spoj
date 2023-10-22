package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dem_tu {
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int m, n;
            n = sc.nextInt();
            m = sc.nextInt();
            String[] word = new String[m];
            for (int i = 0; i < m; i++) {
                word[i] = sc.next();
            }
            char[][] arr = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.next().charAt(0);
                }
            }
            int[] ctn = new int[m];
            int ax;
            int ay;
            for (int k = 0; k < m; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int start;
                        if (arr[i][j] == word[k].charAt(0)) {
                            for (int l = 0; l < 8; l++) {
                                ax = i + dx[l];
                                ay = j + dy[l];
                                start = 1;
                                while (start < word[k].length()) {
                                    if (ax < 0 || ay < 0 || ax >= n || ay >= n) break;
                                    if (arr[ax][ay] == word[k].charAt(start)) {
                                        ax = ax + dx[l];
                                        ay = ay + dy[l];
                                        start++;
                                        if (start == word[k].length()) ctn[k]++;

                                    } else break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("#" + t + " ");
            for (int i = 0; i < m; i++) {
                System.out.print(ctn[i] + " ");
            }
            System.out.println();
        }
    }
}
