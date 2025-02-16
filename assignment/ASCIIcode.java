package assignment;
import java.util.Scanner;
public class ASCIIcode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string you want to convert");
        String orignal=input.nextLine();
        input.close();
        char [] charArray=orignal.toCharArray();
        System.out.println(charArray);
    }
}
