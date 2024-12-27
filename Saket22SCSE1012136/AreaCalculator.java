// Program to calculate area of rectangle, circle, and triangle as per user's choice
import java.util.Scanner;
class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle: " + (length * width));
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " + (Math.PI * radius * radius));
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
