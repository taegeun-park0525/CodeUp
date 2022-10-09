package Problem100;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        long sum = num1 + num2 + num3;
        double avr = sum / 3.0;

        DecimalFormat oneDecimal = new DecimalFormat("0.0");
        System.out.println(sum);
        System.out.println(oneDecimal.format(avr));
    }
}
