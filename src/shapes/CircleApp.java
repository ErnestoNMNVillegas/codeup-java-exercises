package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input util = new Input();
        Circle newCircle = new Circle(util.getDouble());
        System.out.println(newCircle.getArea(newCircle.getRadius()));
        System.out.println(newCircle.getCircumference(newCircle.getRadius()));

    }
}
