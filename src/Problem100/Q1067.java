package Problem100;

import java.util.Scanner;

public class Q1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {sc.nextInt()};

        for(int i=0;i < num.length; i++) {
            if(num[i] > 0) {
                System.out.println("plus");
            } else
                System.out.println("minus");

            if(num[i]%2 == 0) {
                System.out.println("even");
            } else
                System.out.println("odd");
        }
    }
}
