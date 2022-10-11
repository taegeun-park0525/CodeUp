package Problem100;

import java.util.Scanner;

public class Q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        for(char i = 'a'; i <= alpha; i++ ){
            System.out.print(i + " ");
        }
    }
}
