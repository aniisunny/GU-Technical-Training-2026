// Program to print the series of a number
import java.util.Scanner;
class SeriesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Series for " + num + ": ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
