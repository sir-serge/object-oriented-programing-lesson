package bankmangament;
import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the loan");
        double loan=input.nextInt();
        System.out.println(compilation(loan)); 
    }
    static double compilation(int a){
        double sum=Math.pow((a*(1+0.012)),12);
        return sum;
    }

}

