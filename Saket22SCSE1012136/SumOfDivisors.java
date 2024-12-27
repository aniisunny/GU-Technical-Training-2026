// Program to print the sum of divisors of a number
import java.util.Scanner;
class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        System.out.println("Sum of divisors of " + num + " is: " + sum);
    }
}
