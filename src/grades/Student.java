package grades;

import java.util.ArrayList;

public class Student {

    //// # 1 ////

    private String name;
//    private int grades;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // TODOne returns the student's name
    public String getName(){
        return this.name;
    };

    // TODOne adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    };

    // TODOne returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
            for (double grade : grades){
                total += grade;
            }
            return total / grades.size();
    };

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
