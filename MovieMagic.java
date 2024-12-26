// Define a class called MovieMagic with the following description
import java.util.Scanner;
class MovieMagic {
    String title;
    String director;
    int year;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie title: ");
        title = sc.nextLine();
        System.out.print("Enter director: ");
        director = sc.nextLine();
        System.out.print("Enter year of release: ");
        year = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year of Release: " + year);
    }
}
