package assignment;
import java.util.Scanner;
public class palidromeNumber {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        n=input.nextInt();


        String numberString=Integer.toString(n);
        String newNumber="";
        for(int i=numberString.length()-1;i>=0;i--){
            newNumber+=numberString.charAt(i);
        }
        int reverseNumber=Integer.valueOf(newNumber);
        
        if(reverseNumber==n){
            System.out.println(n+" is equal to "+reverseNumber);
        }
    }
}
