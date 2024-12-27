// Program to take input of rate and quantity, calculate the amount, and apply a 15% discount if the amount exceeds 2000
import java.util.Scanner;
class AmountAfterDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        
        double amount = rate * quantity;
        if (amount > 2000) {
            amount = amount - (amount * 0.15);
        }
        System.out.println("Net amount to be paid: " + amount);

    }
}
