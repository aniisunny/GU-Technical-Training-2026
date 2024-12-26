// Program to convert a string into PIGLATIN form
import java.util.Scanner;
class PigLatinConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        // Check if the string starts with a vowel
        char firstLetter = word.charAt(0);
        
        String pigLatinWord;
        
        if ("aeiouAEIOU".indexOf(firstLetter) != -1) {
            pigLatinWord = word + "way"; // If starts with vowel, add "way" to the end
        } else {
            pigLatinWord = word.substring(1) + firstLetter + "ay"; // If starts with consonant, move first letter to the end and add "ay"
        }
        
        System.out.println("PigLatin form: " + pigLatinWord);
    }
}
