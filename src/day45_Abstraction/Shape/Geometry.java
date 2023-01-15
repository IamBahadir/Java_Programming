package day45_Abstraction.Shape;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("*****************Circle*******************");

        Circle circle = new Circle(5);
        System.out.println("circle = " + circle);
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());
        circle.setRadius(15);
        System.out.println("circle = " + circle);

        System.out.println("******************************************");
        System.out.println("***************Rectangular****************");

        Rectangular rectangular = new Rectangular(5,4);
        System.out.println("rectangular = " + rectangular);
        System.out.println("rectangular.perimeter() = " + rectangular.perimeter());
        System.out.println("rectangular.area() = " + rectangular.area());
        rectangular.setLength(15);
        rectangular.setWidth(10);
        System.out.println("rectangular = " + rectangular);

        System.out.println("******************************************");
        System.out.println("******************Square******************");

        Square square = new Square(5);
        System.out.println("square = " + square);
        System.out.println("square.perimeter() = " + square.perimeter());
        System.out.println("square.area() = " + square.area());
        square.setSide(7);
        System.out.println("square = " + square);

        System.out.println("******************************************");
        System.out.println("******************Triangle******************");

        Triangle triangle = new Triangle(5,7,9);
        System.out.println("triangle = " + triangle);
        System.out.println("triangle.area() = " + triangle.area());
        System.out.println("triangle.perimeter() = " + triangle.perimeter());
        triangle.setSide1(1);
        triangle.setSide2(2);
        triangle.setBase(3);
        System.out.println("triangle = " + triangle);

        System.out.println("******************************************");
        System.out.println("******************Cone********************");

        Cone cone = new Cone(5,5);
        System.out.println("cone = " + cone);
        System.out.println("cone.area() = " + cone.area());
        System.out.println("cone.volume() = " + cone.volume());
        cone.setHeight(6);
        cone.setRadius(25);
        System.out.println("cone = " + cone);

        System.out.println("******************************************");
        System.out.println("******************Cube********************");

        Cube cube = new Cube(15);
        System.out.println("cube = " + cube);
        System.out.println("cube.area() = " + cube.area());
        System.out.println("cube.volume() = " + cube.volume());
        cube.setSide(25);
        System.out.println("cube = " + cube);
        System.out.println("******************************************");

        System.out.println("*****************Cylinder******************");

        Cylinder cylinder = new Cylinder(15,25);
        System.out.println("cylinder = " + cylinder);
        System.out.println("cylinder.volume() = " + cylinder.volume());
        System.out.println("cylinder.area() = " + cylinder.area());
        cylinder.setHeight(11);
        cylinder.setHeight(13);
        System.out.println("cylinder = " + cylinder);

        System.out.println("******************************************");
        System.out.println("*************RectangularPrism*************");

        RectangularPrism rectangularPrism = new RectangularPrism(5,10,15);
        System.out.println("rectangularPrism = " + rectangularPrism);
        System.out.println("rectangularPrism.area() = " + rectangularPrism.area());
        System.out.println("rectangularPrism.volume() = " + rectangularPrism.volume());
        rectangularPrism.setHeight(3);
        rectangularPrism.setLength(4);
        rectangularPrism.setWidth(5);
        System.out.println("rectangularPrism = " + rectangularPrism);
        System.out.println("******************************************");

        System.out.println("******************Sphere******************");

        Sphere sphere = new Sphere(5);
        System.out.println("sphere = " + sphere);
        System.out.println("sphere.volume() = " + sphere.volume());
        System.out.println("sphere.area() = " + sphere.area());
        sphere.setRadius(13);
        System.out.println("sphere = " + sphere);

        System.out.println("******************************************");




    }// end line of the Main method
}// end line of the Geometry class
