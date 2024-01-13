import java.util.Scanner;

public class CharacterConverter {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your desired character to find its frequency:");
        String givenChar = kb.nextLine();

        System.out.println("Enter your desired string to see the frequency of your character provided above: ");
        char givenString = kb.next().charAt(0);

        int frequency = 0;
        for(int i=0; i < givenChar.length(); i++) {
            if(givenChar.charAt(i) == givenString) {
                frequency++;
            }
        }

        System.out.println("The character " + givenChar + " appears " + frequency + " in the provided string");

    }
}

