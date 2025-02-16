package assignment;
import java.util.Scanner;
public class password {
        public static void main(String[] args) {  
            Scanner input=new Scanner(System.in);
            System.out.println("enter the password");
            String password = input.next();
            boolean isValid = password.length() >= 8;
            boolean hasNumber = false;
            boolean hasUpperCase = false;
            boolean hasSpecialChar = false;
            String specialCharacters = "!@#$%^&*()-+";
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasNumber = true;
                }
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (specialCharacters.indexOf(ch) != -1) {
                    hasSpecialChar = true;
                }
            }
            isValid = isValid && hasNumber && hasUpperCase && hasSpecialChar;
            if (isValid) {
                System.out.println("The password meets the security standards.");
            } else {
                System.out.println("The password does not meet the security standards.");
            }
        }
    }
    
