import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean confirmation;

        do {
            System.out.print("This is Bob. He is...err...shy...yes, that is it. Talk to him: ");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.indexOf("lie") != 0) {
                System.out.println("No cap. fr fr!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.print("Do you want to keep talking to Bob (y/n)? ");
            String confirm = scanner.nextLine();
            confirmation = confirm.equalsIgnoreCase("y");

        } while (confirmation);

    }
}
