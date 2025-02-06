import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a character: ");
            String Char = s.nextLine();

            if (Char.length() == 1) {
                char character = Char.charAt(0);
                if (Character.isLetter(character)) {
                    switch (Character.toLowerCase(character)) {
                        case 'a', 'e', 'i', 'o', 'u'-> {
                            System.out.println(Char + " is a vowel.");
                        }
                        default -> System.out.println(Char + " is not a vowel.");
                    }
                } else {
                    System.out.println("Please enter a letter.");
                }
            } else {
                System.out.println("Please enter a single character.");
            }
        }
    }
}