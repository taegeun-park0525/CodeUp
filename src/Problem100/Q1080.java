package Problem100;

import java.util.Scanner;

public class Q1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; sum <= num; i++) {
            sum += i;
            if (sum >= num) {
                System.out.println(i);
                break;
            }
        }

    }
}
