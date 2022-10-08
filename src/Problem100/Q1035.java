package Problem100;

import java.util.Scanner;

public class Q1035 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   String hexNum = sc.next();

    int radixNum = Integer.parseInt( hexNum ,16 );

    System.out.println(Integer.toOctalString(radixNum));
    }
}
