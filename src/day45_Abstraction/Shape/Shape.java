package day45_Abstraction.Shape;

public abstract class Shape { // parent class called Shape.

    private final String name;


    public Shape(String name) {
        if (name.isEmpty()|| name.isBlank()){
            throw new RuntimeException("The name does not have blink or empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract double area();



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                '}';
    }
} // end line of the Shape class
