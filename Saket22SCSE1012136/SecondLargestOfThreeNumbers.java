// Program to take input of 3 numbers and print the second largest
import java.util.Scanner;
class SecondLargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));
        int secondLargest = Math.min(Math.max(num1, num2), Math.max(num2, num3));
        
        System.out.println("Second largest number: " + secondLargest);
  
    }
}
