// Program to input a lower limit and an upper limit from user and print all the numbers in between
import java.util.Scanner;
class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerLimit = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upperLimit = sc.nextInt();
        
        System.out.println("Numbers in range: ");
        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.println(i);
        }
    }
}
