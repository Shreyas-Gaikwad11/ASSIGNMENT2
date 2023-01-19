// 2. TO CHECK LEAP YEAR OR NOT.

import java.util.Scanner;
public class QueNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YEAR : ");
        int year   = sc.nextInt();

        if (((year %4 == 0) && (year %100 != 0)) || (year %400 == 0)){
            System.out.println("YEAR IS LEAP YEAR");
        }
            else{
                System.out.println("YEAR IS NOT LEAP YEAR");
        }
    }
}
