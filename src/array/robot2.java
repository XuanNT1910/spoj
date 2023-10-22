package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class robot2 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int X, Y, K;
            X = sc.nextInt();
            Y = sc.nextInt();
            K = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int huong1 = 0;
            int huong2 = 0;
            int dem = 0;
            int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
            for (int i = 0; i < K; i++) {
                if (s1.charAt(i) == 'N') huong1 = 0;
                if (s1.charAt(i) == 'E') huong1 = 1;
                if (s1.charAt(i) == 'S') huong1 = 2;
                if (s1.charAt(i) == 'W') huong1 = 3;
                if (s1.charAt(i) == 'C') huong1 = huong1;
                if (s1.charAt(i) == 'B') huong1 = (huong1 + 2) % 4;
                if (s1.charAt(i) == 'R') huong1 = (huong1 + 1) % 4;
                if (s1.charAt(i) == 'L') huong1 = (huong1 + 3) % 4;
                x1 = x1 + dx[huong1];
                y1 = y1 + dy[huong1];

                if (s2.charAt(i) == 'N') huong2 = 0;
                if (s2.charAt(i) == 'E') huong2 = 1;
                if (s2.charAt(i) == 'S') huong2 = 2;
                if (s2.charAt(i) == 'W') huong2 = 3;
                if (s2.charAt(i) == 'C') huong2 = huong2;
                if (s2.charAt(i) == 'B') huong2 = (huong2 + 2) % 4;
                if (s2.charAt(i) == 'R') huong2 = (huong2 + 1) % 4;
                if (s2.charAt(i) == 'L') huong2 = (huong2 + 3) % 4;
                x2 = x2 + dx[huong2];
                y2 = y2 + dy[huong2];

                if (x1 == x2 && x1 == X && y1 == y2 && y1 == Y) {
                    dem = 1;
                    break;
                }
                if ((x1 == X && y1 == Y) || (x2 == X && y2 == Y)) {
                    dem = 2;
                    break;
                }
            }

            double ax = Math.sqrt((X - x1) * (X - x1) + (Y - y1) * (Y - y1));
            double ay = Math.sqrt((X - x2) * (X - x2) + (Y - y2) * (Y - y2));
            String formattedAx = String.format("%.3f", ax);
            String formattedAy = String.format("%.3f", ay);
            if (dem == 1) {
                System.out.println("Good game!");
            } else if (dem == 2) {
                if ((x1 == X && y1 == Y)) System.out.println("Team A win");
                if ((x2 == X && y2 == Y)) System.out.println("Team B win");
            } else {
                System.out.println("#" + t + " " + formattedAx + " " + formattedAy);
            }
        }
    }
}
