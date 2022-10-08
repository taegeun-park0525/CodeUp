package Problem100;

import java.util.Scanner;

public class Q1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doubleNum = sc.nextDouble();
        String strNum = String.valueOf(doubleNum);
        String[] numArray = strNum.split("[.]");
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
    }
}
