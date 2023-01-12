package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    protected double side;

//    public Square(double side) {
//        super(side, side);
////         new Rectangle(side, side);
//    }
//
//    public double getArea (){
//        double side = super.getLength();
//        //double side = this.length  From walk-thru
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter (){
//        double side = super.length;
//        return 4 * side;
//    }

}
