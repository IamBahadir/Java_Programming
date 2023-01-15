package day39_Recap.shapeTask;

public class Square extends Shape{ // square is a shape. square also is a relation.

    // what is the meaning of 'square' in my own language is "kare"

    private double side;

    // after we call the attribute we created under the parent class then
    // we need to add the private attribute we created under the child class


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0){
            System.err.println("Invalid side");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }


}
