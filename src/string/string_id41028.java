package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class string_id41028 {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        String tmp;
        int op1,op2,op3;
        for (int t = 1; t <= tc; t++) {
            tmp = scanner.next();
            op1 = toInt(tmp);
            tmp = scanner.next();
            tmp = scanner.next();
            op2 = toInt(tmp);
            tmp = scanner.next();
            tmp = scanner.next();
            op3 = toInt(tmp);

            if (op1 == -1){
                System.out.println((op3-op2)+" + "+op2+" = "+op3);
            } else if (op2==-1) {
                System.out.println(op1 +" + "+(op3-op1)+" = "+op3);
            } else {
                System.out.println(op1 +" + "+op2+" = "+(op1+op2));
            }

        }
    }

    private static int toInt(String s) {
        int a=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'm'){
                return -1;
            }
            a = a*10 + s.charAt(i) - '0';
        }
        return a;
    }
}
