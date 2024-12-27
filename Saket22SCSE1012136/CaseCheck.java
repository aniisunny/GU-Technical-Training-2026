// Program to input a character and check whether it is uppercase or lowercase
import java.util.Scanner;
class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is uppercase.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is lowercase.");
        } else {
            System.out.println("Not a letter.");
        }
    }
}
