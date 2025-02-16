package assignment;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner input=new Scanner (System.in);
        System.out.println("enter 3 numbers");
        s1=input.nextInt();
        s2=input.nextInt();
        s3=input.nextInt();
        System.out.println(s1+"  "+s2+"  "+s3);
        if (s1==s2 && s1==s3 && s3==s2) {
            System.out.println("this ttriangel has all sides egual");
        }else if ((s1==s2 && s3!=s1) || (s3==s1 && s2!=s3) || (s3==s2 && s1!=s3) ) {
            System.out.println("the triangle has two equal sides");
        }
        else{
            System.out.println("the triangle has no equal sides");
        }

    }
    
}
