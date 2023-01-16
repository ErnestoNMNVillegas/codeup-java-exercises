import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

    public static void main(String[] args) {
        //// #1 ////
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//    }
        //Result:  [I@2f92e0f4

        Person[] people = {new Person("Bro"), new Person("Bruh"), new Person("Brooo")};

        for (Person persons : people) {
            System.out.println(persons.getName());
        }

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people);
//        }

        Person homie = new Person("Homie");
        people = addPerson(people, homie);

        for (Person persons : people) {
            System.out.println(persons.getName());
        }


    }
}
