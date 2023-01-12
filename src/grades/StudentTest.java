package grades;

public class StudentTest {

    public static void main(String[] args) {

        //// # 1 ////
        Student Billy = new Student("Billy");

        System.out.println("Billy.getName() = " + Billy.getName());

        Billy.addGrade(80);
        Billy.addGrade(90);
        Billy.addGrade(40);
        Billy.addGrade(90);
        Billy.addGrade(50);

        System.out.println("Billy.getGradeAverage() = " + Billy.getGradeAverage());


    }

}
