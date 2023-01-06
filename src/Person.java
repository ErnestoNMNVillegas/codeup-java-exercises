public class Person {

    private String name;

    public String getName(){
        return this.name;
//TODOne: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODOne: change the name field to the passed value
    }
    public void sayHello(){
        System.out.println("Hello, " + name);
//TODOne: print a message to the console using the person's name
    }

    public Person () {}

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        //// Object basics ////

//        Person ernie = new Person ("Ernie");
//        System.out.println(ernie.name);
//        System.out.println(ernie.getName());
//
//        ernie.setName("Ernesto");
//        System.out.println(ernie.getName());
//
//        ernie.sayHello();

        //// Understanding references ////

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        //true false

//        Person person1 = new Person("John");
//        Error already defined
//        Person person2 = person1;
//        Error already defined
//        System.out.println(person1 == person2);
        //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        //John John Jane Jane



    }

}
