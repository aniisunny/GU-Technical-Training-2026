// Program to take input of 3 numbers and print the largest using AND operator
import java.util.Scanner;
class LargestOfThreeNumbersUsingAndOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("Largest number: " + num1);
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Largest number: " + num3);
        }

    }
}
