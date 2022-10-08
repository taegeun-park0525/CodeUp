package Problem100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        double doubleNum = (double)num1 / num2;
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
        System.out.println(twoDecimal.format(doubleNum));
    }
}
