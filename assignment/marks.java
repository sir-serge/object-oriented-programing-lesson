package assignment;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks;
        System.out.println("enter marks");
        marks=input.nextInt();
        System.out.println("enter maxmum mark");
        int total=input.nextInt();
        input.close();
        int percentage=(marks*total)/100;
        if (percentage >= 90){
            System.out.println( "A");  
        }
        else if (percentage >= 80){

         System.out.println( "B");
        }
        else if (percentage >= 70){

         System.out.println( "C");
        }
        else if (percentage >= 60){

         System.out.println( "D");
        }
        else {System.out.println( "F");
    }
    }
}
