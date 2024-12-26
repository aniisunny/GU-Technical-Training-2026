// Program to take input of rupees and convert them into paise
import java.util.Scanner;
class RupeesToPaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int rupees = sc.nextInt();
        int paise = rupees * 100;
        System.out.println("Equivalent paise: " + paise);
    }
}
