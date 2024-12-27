// Define a class called ParkingLot with the following description
import java.util.Scanner;
class ParkingLot {
    String name;
    String location;
    int totalSpots;
    int availableSpots;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parking lot name: ");
        name = sc.nextLine();
        System.out.print("Enter parking lot location: ");
        location = sc.nextLine();
        System.out.print("Enter total number of spots: ");
        totalSpots = sc.nextInt();
        System.out.print("Enter number of available spots: ");
        availableSpots = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Parking Lot Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Spots: " + totalSpots);
        System.out.println("Available Spots: " + availableSpots);
    }
}
