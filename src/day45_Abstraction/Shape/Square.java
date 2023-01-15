package day45_Abstraction.Shape;

public final class Square extends Shape implements Perimeter{ // one of the child class

    /*
    Square
        Area         : a*a
        perimeter    : 4*a

        class needed : side
     */

    private double side;


    public Square(double side) {
        super("Square");
        setSide(side);
    }



    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid value : "+side);
        }
        this.side = side;
    }



    @Override // it comes from parent class
    public double area() {
        return side*side;
    }
    @Override // it comes from interface
    public double perimeter() {
        return 4*side;
    }



    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }


}// end line of the Square class
