package Problem100;

import java.util.Scanner;

public class Q1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        String[] dateArr = date.split("[.]");

        System.out.printf("%s-%s-%s",dateArr[2],dateArr[1],dateArr[0]);
    }
}
