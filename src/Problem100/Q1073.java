package Problem100;

import java.util.Scanner;

public class Q1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            } else
                System.out.println(num);
        }
        sc.close();
    }
}
