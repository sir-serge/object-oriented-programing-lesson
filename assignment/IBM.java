package assignment;
import java.util.Scanner;
public class IBM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your weight");
        int weight=input.nextInt();
        System.out.println("enter your height");
        int height=input.nextInt();
        int BIM=weight/(height*height);
        if(BIM<18.5){
            System.out.println("underweight");
        }else if(BIM<=24.9 && BIM>=18.5){
            System.out.println("Normal");
        }else if(BIM<25 & BIM>24.9){
            System.out.println("over weight");
        }  
        else if(BIM>30){
            System.out.println("obese");
        }
    }
}
