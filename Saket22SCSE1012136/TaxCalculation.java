// Program to take input of income and calculate the tax to be paid as per rules
import java.util.Scanner;
class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0;
        
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.1;
        } else {
            tax = income * 0.15;
        }
        
        System.out.println("Tax to be paid: " + tax);
       
    }
}
