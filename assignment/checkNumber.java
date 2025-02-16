package assignment;
import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();
        
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        if(n%2==0){
            System.out.println("the number is even");
    }else{
        System.out.println("the number is odd");
    }

    }
}
