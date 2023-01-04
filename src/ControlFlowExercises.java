import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //// #1-a ////

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        //// #1-b ////

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);


//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i <= 1000000);

        //// #1-c Above in for loops ////

//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1000000; i*=i) {
//            System.out.println(i);
//        }

        //// #2 ////

//        for (int i = 1; i <= 100; i++)
//        {
//            if (((i % 5) == 0) && ((i % 7) == 0)) {
//                System.out.println("FizzBuzz");
//            }
//            else if ((i % 3) == 0) {
//                System.out.println("Fizz");
//            }
//            else if ((i % 5) == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

        //// #3 ////

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!\n number | squared | cubed\n ------ | ------- | -----\n");
//
//        for (int i = 1; i <= userInput; i++) {
//            int cubed = (int) Math.pow(i, 3);
//            int squared = (i*i);
//            System.out.println(i + "    |      " + squared + "   |     " + cubed);
//        }
//
//        System.out.print("Do you wish to continue (y/n)? ");
//        char yesNo = scanner.next().charAt(0);
//
//        if (yesNo == 'y'){
//            System.out.print("Enter an integer: ");
//            int userInput2 = scanner.nextInt();
//            System.out.println("Here is your table!\n number | squared | cubed\n ------ | ------- | -----\n");
//
//            for (int i = 1; i <= userInput2; i++) {
//                int cubed = (int) Math.pow(i, 3);
//                int squared = (i*i);
//                System.out.println(i + "    |      " + squared + "   |     " + cubed);
//            }
//        } else {
//            System.out.println("Fine.");
//        }

        //// #4 ////
        System.out.print("Enter your number grade (0-100) to receive your letter grade: ");
        int userInputGrade = scanner.nextInt();

        switch (userInputGrade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("Failure");
                break;
            default:
                System.out.println("F");
                break;
        };

        System.out.print("Do you wish to continue (y/n)? ");
        char yesNo = scanner.next().charAt(0);

                if (yesNo == 'y'){
                    System.out.print("Enter your number grade (0-100) to receive your letter grade: ");
                    int userInputGrade2 = scanner.nextInt();

                    switch (userInputGrade2) {
                        case 10:
                        case 9:
                            System.out.println("A");
                            break;
                        case 8:
                            System.out.println("B");
                            break;
                        case 7:
                            System.out.println("C");
                            break;
                        case 6:
                            System.out.println("D");
                            break;
                        case 5:
                            System.out.println("F");
                            break;
                        default:
                            System.out.println("F");
                            break;
                    };
                } else {
                                System.out.println("Fine.");
                }

    }
}
