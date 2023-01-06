import java.io.PrintStream;
import java.util.Scanner;

public class MethodsExercises {

    public static Scanner scanner = new Scanner(System.in);


    //// # 1 ////

//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//    //Note:  Dividing by 0 causes error.
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }

    //// #2 ////
//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between this range (" + min + " and "+ max +"): ");
//        int userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        }
//        return getInteger(min, max);
//    }


    //// #3 ////
    public static void factorial() {
        boolean confirmation = true;
        do {
            System.out.print("Enter an integer between 1 and 10: ");
            long userInputFact = scanner.nextInt();
            long factorialX = 1;

            if (userInputFact >= 1 && userInputFact <= 10) {
                for (int i = 1; i <= userInputFact; i++) {
                    factorialX *= i;
                }
            } else {
                continue;
            }

            System.out.printf("%d! = %d%n", userInputFact, factorialX);

            System.out.print("Do you want to continue factorialing (y/n)? ");
            String confirm = scanner.next();
            confirmation = confirm.equalsIgnoreCase("y");

        } while (confirmation);
    }

    public static void diceRoll() {
        boolean confirmation = true;
        do {
            System.out.print("Enter the number of sides for a pair of dice: ");
            long userInputDice = scanner.nextInt();
            long dice1 = randomDiceNum(userInputDice);
            long dice2 = randomDiceNum(userInputDice);

            System.out.printf("Dice One Roll: %d%n Dice Two Roll: %d%n", dice1, dice2);

            System.out.print("Do you want to continue rolling dice (y/n)? ");
            String confirm = scanner.next();
            confirmation = confirm.equalsIgnoreCase("y");

        } while (confirmation);
    }

    public static long randomDiceNum(long num) {
        long diceNum = (int)(Math.random()* num +1);
        return diceNum;
    }

    //// #4 ////

    public static void main(String[] args) {
        //// #1 ////
//        System.out.println("Addition method: " + addition(2, 3));
//        System.out.println("Subtraction method: " + subtraction(10, 5));
//        System.out.println("Multiplication method: " + multiplication(10, 5));
//        System.out.println("Division method: " + division(10, 5));
//        System.out.println("Modulus method: " + modulus(10, 5));

        //// #2 ////
//        System.out.println(getInteger(1, 10));

        //// #3 ////
        factorial();

        //// #4 ////
//        diceRoll();

    }
}
