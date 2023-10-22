package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class string_id400 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        while (true){
            int N;
            N = scanner.nextInt();
            if (N == 0) break;
            String s;
            char[][] ss = new char[200][200];
            s = scanner.next();
            int M = s.length() / N;
            for (int i = 0; i < M; i++) {
                if (i%2==0){
                    for (int j = 0; j < N; j++) {
                        ss[i][j] = s.charAt(N*i+j);
                    }
                } else {
                    for (int j = 0; j < N; j++) {
                        ss[i][N-j-1] = s.charAt(N*i+j);
                    }
                }
            }
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M; j++)
                {
                    System.out.print(ss[j][i]);
                }
            }
            System.out.println();
        }
    }
}
