// Program to take input of 2 numbers and print their difference
import java.util.Scanner;
class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);
       
    }
}
