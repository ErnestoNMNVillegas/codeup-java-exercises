package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

//        Measurable myShape = new Measurable() {
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }
//        };

//        Measurable myShape = new Square(4);
        Measurable myShape = new Rectangle(4, 5);

//        System.out.println("myShape.getArea() = " + myShape.getArea());
//        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        System.out.println("myShape.getArea() = " + myShape.getArea());

        myShape.getLength();
        myShape.getWidth();


    }

}
