package Problem100;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String data[] = date.split("[.]");

        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);

    }
}
