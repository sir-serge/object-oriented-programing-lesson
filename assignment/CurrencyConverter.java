package assignment;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("chose number representing  you currency ");
        System.out.println("1:kes , 2:UGX , 3:TZS , 4:RWF");
        int currency=input.nextInt();
        System.out.println("enter the amount you want to convert");
        double amount = input.nextFloat();
        double converted =0;
         switch (currency){
            case 1 :  
                converted= amount * 130.5; 
                 break;  
            case 2 :
                 converted=amount * 3850;
                 break;  
            case 3 : 
                converted=amount * 2500;
                break;  
            case 4 : 
                converted=amount * 1300;
                break;  
            default : 
            System.out.println("enter valid currency"); 
                break; 
         }

        System.out.println("Converted Amount: " + converted + " " + currency);
    }
}
