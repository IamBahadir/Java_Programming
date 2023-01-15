package day45_Abstraction.Shape;

public final class Cone extends Shape implements Pi,Volume{// one of the child class

    /*
    Cone
        base Area    : pi*r*r
        Volume       : ( pi*r*r*h )/ 3

        class needed : pi & radius & height
     */

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        super("Cone");
        setRadius(radius);
        setHeight(height);
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Invalid value: "+radius);
        }
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height<=0){
            throw new RuntimeException("Invalid value: "+height);
        }
        this.height = height;
    }


    @Override
    public double area() { // it comes from parent class
        return pi*radius*radius;
    }
    @Override // it comes from interface
    public double volume() {
        return ( pi*radius*radius*height )/ 3;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

}// end line of the Cone Class
