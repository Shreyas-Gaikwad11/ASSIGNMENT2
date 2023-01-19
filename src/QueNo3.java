// 3. TO CHECK VOWEL OR CONSONANT USING SWITCH CASE.

import java.util.Scanner;
public class QueNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY CHARACTER : ");
        char c = sc.next().charAt(0);

        switch (c){
            case('A'):
                System.out.println("IT IS VOWEL");
                break;
            case'E':
                System.out.println("IT IS VOWEL");
                break;
            case'I':
                System.out.println("IT IS VOWEL");
                break;
            case'O':
                System.out.println("IT IS VOWEL");
                break;
            case'U':
                System.out.println("IT IS VOWEL");
            break;
            case'a':
                System.out.println("IT IS VOWEL");
                break;
            case'e':
                System.out.println("IT IS VOWEL");
                break;
            case'i':
                System.out.println("IT IS VOWEL");
                break;
            case'o':
                System.out.println("IT IS VOWEL");
                break;
            case'u':
                System.out.println("IT IS VOWEL");
                break;
            default:
                System.out.println("IT IS NOT A VOWEL");

        }

    }
}
