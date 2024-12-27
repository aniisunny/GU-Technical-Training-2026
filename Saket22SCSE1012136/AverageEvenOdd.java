// Program to calculate the average of even and odd numbers until user presses -1
import java.util.Scanner;
class AverageEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;
        
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }
        
        System.out.println("Average of even numbers: " + (evenCount > 0 ? (evenSum / evenCount) : 0));
        System.out.println("Average of odd numbers: " + (oddCount > 0 ? (oddSum / oddCount) : 0));
    }
}
