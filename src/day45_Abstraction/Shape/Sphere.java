package day45_Abstraction.Shape;

public final class Sphere extends Shape implements Pi,Volume{

    /*
    Sphere

        surface Area : 4*pi*r*r
        Volume       : 4/3(pi*r*r*r)

        class needed : pi & radius
     */

    private double radius;

    public Sphere(double radius) {
        super("Sphere");
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
    public double area() {
        return 4*pi*radius*radius;
    }

    @Override
    public double volume() {
        return 4/3*(pi*radius*radius*radius);
    }


    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}// end line of the Sphere class
