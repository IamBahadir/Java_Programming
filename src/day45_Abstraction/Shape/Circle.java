package day45_Abstraction.Shape;

public final class Circle extends Shape implements Perimeter , Pi { // one of the child class


    /*
    Circle
        Area         : pi*r*r
        perimeter    : 2*pi*r

        class needed : pi & radius
     */

    private double radius;


    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid value : "+radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() { // it comes from Parent class
        return pi*radius*radius;
    }

    @Override // it comes from Interface
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}// end line of the Circle class
