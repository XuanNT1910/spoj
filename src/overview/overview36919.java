package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview36919 {
    public static int convert(int n){
        while (n>9){
            int a=0;
            while (n>0){
                a = a+n%10;
                n=n/10;
            }
            n = a;
        }
        return n;
    }
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=1;i<=tc;i++){
            int x=sc.nextInt();
            System.out.println("#"+i+" "+convert(x));
        }
    }
}
