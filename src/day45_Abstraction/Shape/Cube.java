package day45_Abstraction.Shape;

public final class Cube extends Shape implements Volume{ // one of the child class


    /*
    Cube

        surface Area : 6*a*a
        Volume       : a * a * a

        class needed : side
     */

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid Value : "+side);
        }
        this.side = side;
    }


    @Override// it comes from parent class
    public double area() {
        return 6*side*side;
    }

    @Override // it comes from interface
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }
}// end line of the Cube class
