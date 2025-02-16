package assignment;
import java.util.Scanner;
public class loanEligbilty {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter loaned need");
        int loan=input.nextInt();
        System.out.println("enter the income");
        int income=input.nextInt();
        System.out.println("enter the credit score");
        int credit=input.nextInt();
        System.out.println("enter the loan you have current");
        int currentLoan=input.nextInt();
        if(currentLoan<income*2 && credit>loan/10 && income>loan/10){
            System.out.println("you are allowed to have az loan");
    }else{
        System.out.println("you are not allowed to have a loan");
    }
    }
}