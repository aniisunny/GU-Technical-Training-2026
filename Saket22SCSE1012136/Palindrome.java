// Program to check whether a number is palindrome
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int reverse = 0;
        
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
