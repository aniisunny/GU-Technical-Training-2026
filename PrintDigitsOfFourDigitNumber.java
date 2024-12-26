// Program to take input of a 4-digit number and print all its digits
import java.util.Scanner;
class PrintDigitsOfFourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();
        
        int firstDigit = num / 1000;
        int secondDigit = (num / 100) % 10;
        int thirdDigit = (num / 10) % 10;
        int fourthDigit = num % 10;
        
        System.out.println("Digits of the number: ");
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Second Digit: " + secondDigit);
        System.out.println("Third Digit: " + thirdDigit);
        System.out.println("Fourth Digit: " + fourthDigit);
    }
}
