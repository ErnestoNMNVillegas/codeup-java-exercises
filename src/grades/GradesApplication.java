package grades;

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

        System.out.println("students = " + students.toString());
    }

}
