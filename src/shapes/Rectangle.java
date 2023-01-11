package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String work() {
        return null;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle (){}
//
//    public double getArea (){
//        return length * width;
//    }
//
//    public double getPerimeter (){
//        return 2 * length + 2 * width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }

}
