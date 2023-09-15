package overview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class overview1 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x!=42){
            System.out.println(x);
            x = sc.nextInt();
        }
    }
}
