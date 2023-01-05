import java.util.Scanner;

public class HighLow {

    public static Scanner scanner = new Scanner(System.in);

    public static void HighLow() {
        Boolean confirmation;
        do {
            System.out.print("Guess my number between 1 - 100: ");
            long userGuess = scanner.nextInt();
//            long userAttempt = 0;
            long randomNum = (int) (Math.random()* 100 +1);

            if (userGuess >= 1 && userGuess <= 100) {
                if (userGuess == randomNum) {
                    System.out.println("GOOD GUESS CHEATER!!");
                } else if (userGuess < randomNum){
                    System.out.println("GUESS HIGHER!");
                } else {
                    System.out.println("GUESS LOWER!");
                }
            } else {
                HighLow();
            }

            System.out.printf("User Guess: %d.%n Random Number: %d.%n", userGuess, randomNum);

            System.out.print("Do you want to continue rolling dice (y/n)? ");
            String confirm = scanner.next();
            confirmation = confirm.equalsIgnoreCase("y");

        } while (confirmation);
    }

    public static void main(String[] args) {

        HighLow();

    }
}
