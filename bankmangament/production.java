
package bankmangament;
import java.util.Scanner;
public class production {
    public static void main(String[] args) {
        int addedStock=addStock();
        int initialStock=currentStock();
        // total(addedStock, initialStock);
        System.out.println(total(addedStock, initialStock));
    }
    static int addStock(){
        int stock=40;
        return stock;
    }
    static int currentStock(){
        int current=110;
        return current;
    }
    static int total(int num1,int num2){
        return num2+num1;
    }
}
