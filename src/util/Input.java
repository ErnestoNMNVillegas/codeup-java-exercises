package util;

import java.util.Scanner;

public class Input {
//    private Scanner scanner = new Scanner(System.in);
//    public Scanner getScanner() {
//        return scanner;
//    }
    ////Original code.  Changed after walk-thru

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }
    //Note:  Above from walk-thru

//    public String getString() {
//        System.out.print("Enter: ");
//        String strInput = getScanner().nextLine();
//        System.out.println(strInput);
//        return strInput;
//    }
    ////Original code.  Changed after walk-thru
    public String getString(String string) {
        System.out.println(string + ": ");
        return this.scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.print("Select y/n: ");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between" + min + " and "  + max + ": ");
        int num = scanner.nextInt();

        if(num < min || num > max){
            System.out.print("Out of range number.  Try again: ");
            return getInt(min, max);
        }
        return num;
    }

//    public int getInt() {
//        System.out.print("Enter an integer: ");
//        return this.scanner.nextInt();
//    }

        public int getInt() {
//        int userResp = 0;
        try{
            int userResp = Integer.valueOf(getString("Enter an integer"));
            System.out.println("Good job entering an integer!");
            return Integer.valueOf(userResp);
        }
        catch (NumberFormatException e){
            System.out.println("Wrong value entered: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
            return getInt();
        }
//            return Integer.valueOf(userResp);
        }


    public double getDouble(double min, double max) {
        System.out.print("Enter a number between" + min + " and "  + max + ": ");
        double num = scanner.nextDouble();

        if(num < min || num > max){
            System.out.print("Out of range number.  Try again: ");
            return getDouble(min, max);
        }
        return num;
    }

//    public double getDouble() {
//        System.out.print("Enter a double: ");
//        return this.scanner.nextInt();
//    }
    public double getDouble() {
        try{
            Double userResp = Double.valueOf(getString("Enter a double"));
            System.out.println("Valid input");
            return Double.valueOf(userResp);
        }
        catch (NumberFormatException e){
            System.out.println("Wrong value entered: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
            return getDouble();
        }
    }



}
