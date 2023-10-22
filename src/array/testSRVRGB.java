package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testSRVRGB {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int N, M;
            N = sc.nextInt();
            M = sc.nextInt();
            int[] dem = new int[6];
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //*****************************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[0]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[0]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[0]++;
                    }
                }
            }
            //***********************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[1]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[1]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[1]++;
                    }
                }
            }
            //***********************************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[2]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[2]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[2]++;
                    }
                }
            }
            //********************************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[3]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[3]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[3]++;
                    }
                }
            }
            //********************************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[4]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[4]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[4]++;
                    }
                }
            }
            //********************************
            for (int i = 0; i < N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 3) {
                        dem[5]++;
                    }
                }
            }
            for (int i = N / 3; i < 2 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 2) {
                        dem[5]++;
                    }
                }
            }
            for (int i = 2 * N / 3; i < 3 * N / 3; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] != 1) {
                        dem[5]++;
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                if (dem[i] < min) min = dem[i];
            }
            System.out.println("#" + t + " " + min);
        }
    }
}
