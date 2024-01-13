import java.util.Scanner;

public class CharacterConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter your desired string to see the frequency of your character provided above or\n" +
                    "enter 'exit' to quit program: ");
            String givenString = input.nextLine();
            if(givenString.equals("exit")) {
                System.out.print("You are exiting the program. Goodbye!");
                return;
            }

            System.out.println("Enter your desired character to find its frequency: ");
            char givenChar = input.nextLine().charAt(0);



            int frequency = 0;
            for (int i = 0; i < givenString.length(); i++) {
                if (givenChar == givenString.charAt(i)) {
                    frequency++;
                }
            }

            System.out.println("The character " + givenChar + " appears " + frequency + " times in the provided string");

        }
    }
}
