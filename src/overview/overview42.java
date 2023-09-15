package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview42 {
    public static int reverse(int x){
        int a = 0;
        while (x>0){
            a = a*10 + x%10;
            x = x/10;
        }
        return a;
    }
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            int sum = reverse(x) + reverse(y);
            System.out.println(reverse(sum));
        }

    }
}
