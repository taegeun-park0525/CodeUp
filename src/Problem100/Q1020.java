package Problem100;

import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String data[] = number.split("[-]");

        System.out.printf(data[0]+data[1]);
    }
}
