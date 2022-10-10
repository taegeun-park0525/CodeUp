package Problem100;

import java.util.Scanner;

public class Q1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

            if(grade == 'A') {
                System.out.println("best!!!");
            } else if(grade == 'B') {
                System.out.println("good!!");
            } else if(grade == 'C') {
                System.out.println("run!");
            } else if(grade == 'D'){
                System.out.println("slowly~");
            } else {
                System.out.println("what?");
            }
    }
}
