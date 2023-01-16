package day47_Polymorphism;

import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {


        Shape shape = new Circle(3); // upcasting

        Square square = new Square(4);

        shape = square; // upcasting

        System.out.println(shape);

        System.out.println("shape.area() = " + shape.area()); // this is the feature that belongs to the polymorphism
        // shape.perimeter(); compile error // we can not reach to the child class to get the method its own


        System.out.println("--------------------------------------------");

        // The reason is based on the downcasting that the reference type determines what we can call or access.
        // So, after converting the parent class to the child class
        // we can reach to the bark method we created under the child class

        Square square1 = (Square) shape; // downcasting

        System.out.println("square1.perimeter() = " + square1.perimeter());


        // Another example of the downcasting that we can understand well

        Animal animal = new Dog("Fino","French Buldog","white",'F',2,'S');

        Dog dog = (Dog) animal; // downcasting
        dog.bark();
        dog.play();


        System.out.println("--------------------------------------------");

        Shape shape2 = new Square(4);
        System.out.println("((Square) shape2).perimeter() = " + ((Square) shape2).perimeter());

        System.out.println("--------------------------------------------");

        Employee employee = new Tester("Nur",36,'F',11,"QA Tester",200000); // up casting

        // employee.bugReport(); we need use the downcasting before we call the testing method


        ((Tester)employee).bugReport(); // downcasting
        // ((Developer)employee).buildCode(); // ReferenceTypeCasting


        Developer developer = new Developer("Bahadır",36,'M',2,"Web Developer",500000);

        employee = developer;
        ((Developer)employee).buildCode();
        employee.work();
        employee.eat();
        employee.sleep();



    }// end line of the Main method
}// end line of the ReferenceTypeCasting class
