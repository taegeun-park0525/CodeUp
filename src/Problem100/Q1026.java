package Problem100;

import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] timeArr = time.split(":");
        int result = Integer.parseInt(timeArr[1]);
        System.out.printf("%d",result);
    }
}
