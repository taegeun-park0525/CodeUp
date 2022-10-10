package Problem100;

import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {sc.nextInt(), sc.nextInt(),sc.nextInt()};

        for(int i=0;i < num.length; i++) {
            if(num[i]%2 == 0) {
                System.out.println(num[i]);
            }
        }
    }
}
