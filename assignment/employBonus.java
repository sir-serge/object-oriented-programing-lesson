package assignment;
import java.util.Scanner;
public class employBonus {
    public static void main(String[] args) {
        int salary,discount;
        Scanner input=new Scanner(System.in);
        System.out.println("enter employ salary");
        salary=input.nextInt();
        System.out.println("enter number of year to service");
        discount=input.nextInt();
        if (discount<=5) {
            System.out.println(salary+salary*0.05);
        }else if (discount<=10) {
            System.out.println(salary+salary*0.1);
        }else{
            System.out.println(salary+salary*0.15);
        }

    }
}
