// Program to take a 3-digit number and print the square of the middle digit
import java.util.Scanner;
class MiddleDigitSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int middleDigit = (num / 10) % 10;
        System.out.println("Square of the middle digit: " + (middleDigit * middleDigit));
    }
}
