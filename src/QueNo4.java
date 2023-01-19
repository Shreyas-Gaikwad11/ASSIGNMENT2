// 4. TO FIND QUOTIENT AND REMAINDER.

import java.util.Scanner;
public class QueNo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUM : ");
        int dividend = sc.nextInt();

        System.out.println("ENTER ANY NUM : ");
        int divisor = sc.nextInt();

        int result1 = dividend/divisor;
        int result2 = dividend%divisor;
        System.out.println("QUOTIENT : "+result1);
        System.out.println("REMAINDER : "+result2);
    }
}
