package day45_Abstraction.Shape;

public final class Cylinder extends Shape implements Pi,Volume{ // one of the child class


    /*
    Cylinder

        surface Area : 2*pi*r*h + 2*pi*r*r
        base area    : pi*r*r
        Volume       : pi*r*r*h

        class needed : pi & radius & height
     */

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height<=0){
            throw new RuntimeException("Invalid value : "+height);
        }
        this.height = height;
    }


    @Override // it comes from parent class
    public double area() {
        return (2*pi*radius*height) + (2*pi*radius*radius);
    }
    @Override // it comes from interface
    public double volume() {
        return pi*radius*radius*height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }
}// end line of the Cylinder class
