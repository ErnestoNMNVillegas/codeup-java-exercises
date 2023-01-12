package grades;


public class StudentTest {

    public static void main(String[] args) {

        //// # 1 ////
        Student billy = new Student("Billy");

        System.out.println("Billy.getName() = " + billy.getName());

        billy.addGrade(80);
        billy.addGrade(90);
        billy.addGrade(40);
        billy.addGrade(90);
        billy.addGrade(50);

        System.out.println("Billy.getGrades() = " + billy.getGrades());

        System.out.println("Billy.getGradeAverage() = " + billy.getGradeAverage());


    }

}
