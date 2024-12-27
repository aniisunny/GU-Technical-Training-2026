// Program to take a 3-digit number and print the sum of the first and last digits
import java.util.Scanner;
class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digits: " + sum);
    }
}
