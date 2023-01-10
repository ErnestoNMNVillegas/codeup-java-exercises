package shapes;

public class Square extends Rectangle{

//    protected double side;

    public Square(double side) {
        super(side, side);
//         new Rectangle(side, side);
    }

    public double getArea (){
        double side = super.getLength();
        return Math.pow(side, 2);
    }

    public double getPerimeter (){
        double side = super.getLength();
        return 4 * side;
    }

}
