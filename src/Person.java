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
        Person ernie = new Person ("Ernie");
        System.out.println(ernie.name);
        System.out.println(ernie.getName());

        ernie.setName("Ernesto");
        System.out.println(ernie.getName());

        ernie.sayHello();

    }

}
