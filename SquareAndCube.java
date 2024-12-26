// Program to take input of 1 number and print its square and cube
import java.util.Scanner;
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square: " + (num * num));
        System.out.println("Cube: " + (num * num * num));
    }
}
