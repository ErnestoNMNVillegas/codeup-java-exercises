import java.util.Scanner;

public class HighLow {

    public static Scanner scanner = new Scanner(System.in);

    public static void HighLowMethod() {
        boolean confirmation = true;
        int randomNum = (int) (Math.random()* 100 +1);

        do {
            System.out.print("Guess my number between 1 - 100 (enter 200 to exit): ");
            int userGuess = scanner.nextInt();


            if (userGuess >= 1 && userGuess <= 100) {
                if (userGuess == randomNum) {
                    System.out.println("GOOD GUESS CHEATER!!");
                    System.out.printf("User Guess: %d.%n Random Number (\"hidden\"): %d.%n", userGuess, randomNum);
                    System.out.print("Do you want to continue guessing numbers (y/n)? ");
                    scanner.nextLine();
                    String confirm = scanner.nextLine();
                    confirmation = confirm.equalsIgnoreCase("y");
                } else if (userGuess < randomNum){
                    System.out.println("GUESS HIGHER!");
                } else {
                    System.out.println("GUESS LOWER!");
                }
            } else if (userGuess == 200){
                confirmation = false;
            }

        } while (confirmation);
    }


    public static void main(String[] args) {

        HighLowMethod();

    }
}
