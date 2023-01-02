import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //#1

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %s.%n", pi);
//        System.out.format("The value of pi is approximately %s.%n", pi);

        //Explore the Scanner Class.

        Scanner scanner = new Scanner(System.in);

        //#1

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //input mismatch error when string entered.

        //#2

//        System.out.print("Enter first word: ");
//        String userInput1 = scanner.next();
//        System.out.print("Enter second word: ");
//        String userInput2 = scanner.next();
//        System.out.print("Enter third word: ");
//        String userInput3 = scanner.next();
//
//        System.out.printf("First word: %s.%n Second word: %s.%n Third word: %s.%n", userInput1, userInput2, userInput3 );
        //Note:  More than one word at a time and more than 3.
        // Enter first word: one two three four
        //Enter second word: Enter third word: First word: one.
        // Second word: two.
        // Third word: three.
        //Note:  Will not move on in inputs until something is entered.

        //#3
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.next();
//        System.out.printf("Here is the sentence you entered: %s.%n", userInput );
        //Note:  Only first word in sentence captured.

        //#4
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        System.out.printf("Here is the sentence you entered: %s%n", userInput );

        //Calculate the perimeter and area of Codeup's classrooms.
        System.out.print("Enter the length of your room in ft: ");
        String userLength = scanner.nextLine();
        System.out.print("Enter the width of your room in ft: ");
        String userWidth = scanner.nextLine();

//        int decimalExample = Integer.parseInt("3");





    }
}
