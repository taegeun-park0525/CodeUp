package Problem100;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abc = sc.nextLine().split(" ");

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
            if(abc[i].equals("q"))
                break;
        }
    }
}
