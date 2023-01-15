package day39_Recap.shapeTask;

public class spaceCalculate {

    public static void main(String[] args) {



        // This is how to create a square object
        // I gave 5 to the side.
        Square square = new Square(5);
        System.out.println(square);

        // we're gonna be able to assign a new valuable to the side.
        // because we've been used to getter and setter method

        square.setSide(3);
        System.out.println("square = " + square);

        // we can also see the side of the console or terminal.
        System.out.println(square.getSide());

        System.out.println("------------------------------");

        Circle circle = new Circle(2.5);
        System.out.println(circle);

        circle.setR(3.14);
        System.out.println("circle = " + circle);

        System.out.println(circle.getR());

        System.out.println("------------------------------");

        Rectangle rectangle = new Rectangle(5,5.37);
        System.out.println("rectangle = " + rectangle);

        rectangle.setWidth(1.2);
        rectangle.setLength(1.3);
        System.out.println("rectangle = " + rectangle);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());



    }



}
