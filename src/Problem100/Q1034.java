package Problem100;

import java.util.Scanner;

public class Q1034 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   String octNum = sc.next();

    int radixNum = Integer.parseInt( octNum ,8 );

    System.out.println(radixNum);
    }
}
