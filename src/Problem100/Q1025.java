package Problem100;

import java.util.LinkedList;
import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        LinkedList<Integer> stack = new LinkedList<>();
        while (num > 0) { //0이될때까지 반복
            stack.push((num % 10)*i); //LinkedList에 num을 10으로 나눈 나머지를 저장.
            num = num / 10;          //num을 10으로 나눔
            i = i*10;
        }
        while(stack.isEmpty()==false) {
            System.out.printf("[%d]\n",stack.pop());
        }
    }
}
