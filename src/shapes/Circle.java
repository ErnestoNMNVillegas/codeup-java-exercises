package shapes;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius){
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * this.radius;
    }

    public Circle (){}

}
