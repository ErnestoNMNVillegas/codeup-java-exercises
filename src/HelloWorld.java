public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");

            int myFavoriteNumber;
            myFavoriteNumber = 22;
            System.out.println(myFavoriteNumber);

            String myString;
            myString = "My name is Ernie.";
            //char myString;
            //myString = 3.14159;
            //char creates incompatible types error
            //3.14159 creates incompatible types error
            System.out.println(myString);

            double myNumber;
            //float does not work for 3.14.  change to double or casting
            //long myNumber;
            myNumber = 3.14;
            //myNumber = 123;
            System.out.println(myNumber);
            //error not initialized before 3.14 assigned
            //3.14 not compatible data type.  Need to be double
            //123L:  the L does not print

            //int x = 5;
            //System.out.println(x++);
            //System.out.println(x);

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);
            //post / pre decrement

            //#11
            //int class;
            //errors

            //#12
            //String theNumberThree = "three";
            //Object o = theNumberThree;
            //int three = (int) o;
            //error java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
            //	at HelloWorld.main(HelloWorld.java:43)

            //int three = (int) "three";
            //Inconvertible types; cannot cast 'java.lang.String' to 'int'

            //System.out.println(three);
            //Similar error w/both

            //#13
//            int x = 4;
//            x += 5;

//            int x = 3;
//            int y = 4;
//            y = y * x;
//
//            int x = 10;
//            int y = 2;
//            x = x / y;
//            y = y - x;

            //#14
            //short bigNum;
            //bigNum = 32790;
            //java: incompatible types: possible lossy conversion from int to short




        }
}


