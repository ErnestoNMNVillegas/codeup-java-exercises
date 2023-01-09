import java.util.Arrays;

public class ArraysExercises {

    public static Object addPerson(Object Arr, Object x) {
//        int a[] = { 1, 8, 3 };

        // Creating an array b[] of same size as a[]
        Person[] newArr = new String[Arr.length + 1];

    }

    public static void main(String[] args) {
        //// #1 ////
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//    }
        //Result:  [I@2f92e0f4

        Person[] people = {new Person("Bro"), new Person("Bruh"), new Person("Brooo")};

        for (Person persons : people) {
            System.out.println(persons.getName());
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }


    }


}
