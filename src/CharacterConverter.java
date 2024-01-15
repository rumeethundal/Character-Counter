import java.util.Scanner;

public class CharacterConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter your desired string to see the frequency of your character provided above or\n" +
                    "enter 'exit' to quit program: ");
            String stringToCount = input.nextLine();
            if(stringToCount.equals("exit")) {
                System.out.print("You are exiting the program. Goodbye!");
                return;
            }

            System.out.println("Enter your desired character to find its frequency: ");
            String freqString = input.nextLine();
            if(freqString.length() != 1) {
                System.out.println("Invalid. Please get one character");
                continue;
            }

            char freqChar;
            freqChar = freqString.charAt(0);

            int frequency = 0;
            for (int i = 0; i < stringToCount.length(); i++) {
                if (freqChar == stringToCount.charAt(i)) {
                    frequency++;
                }
            }

            System.out.println("The character " + freqChar + " appears " + frequency + " times in the provided string");

        }
    }
}
