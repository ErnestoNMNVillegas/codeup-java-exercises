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
            System.out.print(string + ": ");
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

    public int getInt() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextInt();
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

    public double getDouble() {
        System.out.print("Enter a double: ");
        return this.scanner.nextInt();
    }


}
