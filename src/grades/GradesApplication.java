package grades;

import util.Input;

import java.util.HashMap;

import java.util.ArrayList;

public class GradesApplication {


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student jori = new Student("Jori");
        jori.addGrade(30);
        jori.addGrade(20);
        jori.addGrade(40);

        Student fulano = new Student("Fulano");
        fulano.addGrade(15);
        fulano.addGrade(54);
        fulano.addGrade(35);

        Student jorge = new Student("Jorge");
        jorge.addGrade(90);
        jorge.addGrade(85);
        jorge.addGrade(85);

        Student seruh = new Student("Saruh");
        seruh.addGrade(99);
        seruh.addGrade(90);
        seruh.addGrade(80);

        students.put("@SleepyCoder", jori);
        students.put("@DrowsyCoder", fulano);
        students.put("@AlertCoder", jorge);
        students.put("@AwakeCoder", seruh);

//        System.out.println("students = " + students.toString());


//        for(String keys : students.keySet()){
//            System.out.print( keys + " | " );
//        }

        Input input = new Input();

            boolean confirmation = true;


            do {
                System.out.println("Welcome!" + "\n" + "Here are the GitHub usernames of our students:");

                for(String keys : students.keySet()){
                    System.out.print( keys + " | " );
                }

                System.out.println("");

                String q1Input = input.getString("What student would you like to see more information on?");

                if (students.get(q1Input) != null) {
                    Student student = students.get(q1Input);
                    System.out.println("students.get(q1Input) = " + student.getGradeAverage());


                } else {
                    System.out.println("Sorry, no student found with the GitHub username of: " + q1Input);
                    String q2Input = input.getString("Would you like to see another student? (y/n)");
                    confirmation = q2Input.equalsIgnoreCase("y");
                }




//                long userInputDice = scanner.nextInt();
//                long dice1 = randomDiceNum(userInputDice);
//                long dice2 = randomDiceNum(userInputDice);
//
//                System.out.printf("Dice One Roll: %d%n Dice Two Roll: %d%n", dice1, dice2);
//
//                System.out.print("Do you want to continue rolling dice (y/n)? ");
//                String confirm = scanner.next();
//                confirmation = confirm.equalsIgnoreCase("y");

            } while (confirmation);




    }
}
