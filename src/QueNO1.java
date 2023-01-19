// 1. MULTIPLY TWO NUMBERS.

import java.util.Scanner;

public class QueNO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT FIRST VALUE : ");
        int num1 = sc.nextInt();

        System.out.println("INPUT SECOND VALUE : ");
        int num2 = sc.nextInt();

        int result = num1*num2;
        System.out.println("ANSWER IS :"+result);

    }
}
