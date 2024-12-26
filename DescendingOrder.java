// Program to take input of 3 numbers and print them in descending order
import java.util.Arrays;
import java.util.Scanner;
class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        
        System.out.println("Numbers in descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);

    }
}
