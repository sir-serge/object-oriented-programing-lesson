package assignment;
import java.util.Scanner;
public class DigitToWord {
    public static void main(String[] args) {
        int digit;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        digit=input.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println(words[digit]);
    }
}
