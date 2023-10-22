package array;

public class duyetmang {
    public static void main(String[] args) {
//		ngang(5);
//		ngangXenKe(5);
//		doc(5);
//		docXenKe(5);
//		cheoXuong(5);
//		cheoLen(5);
//		cheoXenKe(5);
//        xoanOc(7);
    }

    private static void ngang(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = count;
                count++;
            }
        }
        inMaTran(a, n);
    }

    private static void ngangXenKe(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < n; j++) {
                    a[i][j] = count;
                    count++;
                }
            } else {
                for(int j = n - 1; j >= 0; j--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }
        inMaTran(a, n);
    }

    private static void doc(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n; i++) {
                a[i][j] = count;
                count++;
            }
        }
        inMaTran(a, n);
    }

    private static void docXenKe(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int j = 0; j < n; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < n; i++) {
                    a[i][j] = count;
                    count++;
                }
            } else {
                for(int i = n - 1; i >= 0; i--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }
        inMaTran(a, n);
    }

    private static void cheoXuong(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int k = n - 1; k >= 0; k--) {
            for(int i = k, j = 0; i < n && j < n; i++, j++) {
                a[i][j] = count;
                count++;
            }
        }
        for(int k = 1; k < n; k++) {
            for(int i = 0, j = k; i < n && j < n; i++, j++) {
                a[i][j] = count;
                count++;
            }
        }
        inMaTran(a, n);
    }

    private static void cheoLen(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int k = 0; k < n; k++) {
            for(int i = n - 1, j = k; i >= 0 && j >= 0; i--, j--) {
                a[i][j] = count;
                count++;
            }
        }
        for(int k = n - 2; k >= 0; k--) {
            for(int i = k, j = n - 1; i >= 0 && j >= 0; i--, j--) {
                a[i][j] = count;
                count++;
            }
        }
        inMaTran(a, n);
    }

    private static void cheoXenKe(int n) {
        int[][] a = new int[n][n];
        int count = 1;
        for(int k = n - 1; k >= 0; k--) {
            if(k % 2 == 0) {
                for(int i = k, j = 0; i < n && j < n; i++, j++) {
                    a[i][j] = count;
                    count++;
                }
            } else {
                int col = n - k - 1;
                for(int i = n - 1, j = col; i >= 0 && j >= 0; i--, j--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }

        for(int k = n - 2; k >= 0; k--) {
            if(k % 2 == 0) {
                int col = n - k - 1;
                for(int i = 0, j = col; i < n && j < n; i++, j++) {
                    a[i][j] = count;
                    count++;
                }
            } else {
                for(int i = k, j = n - 1; i >= 0 && j >= 0; i--, j--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }

        inMaTran(a, n);
    }

    private static void xoanOc(int n) {
        int count = 1;
        int[][] a = new int[n][n];
        int tren = 0, duoi = n - 1, trai = 0, phai = n - 1;
        while(count <= n*n) {
            for(int i = trai; i <= phai; i++) {
                a[tren][i] = count;
                count++;
            }
            tren++;
            for(int i = tren; i <= duoi; i++) {
                a[i][phai] = count;
                count++;
            }
            phai--;
            for(int i = phai; i >= trai; i--) {
                a[duoi][i] = count;
                count++;
            }
            duoi--;
            for(int i = duoi; i >= tren; i--) {
                a[i][trai] = count;
                count++;
            }
            trai++;
        }
        inMaTran(a, n);
    }

    private static void inMaTran(int[][] a, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
