// Program to convert a character into its toggle case
import java.util.Scanner;
class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        } else if (Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
        }
        
        System.out.println("Toggle case: " + ch);
    }
}
