package day39_Recap.shapeTask;

public class Shape {

    // what is the meaning of 'shape' in my own language is "sekil".

    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {

        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }
    public Shape(String name) {
        setName(name);
    }

    // what is the meaning of 'area' in my own language is "alan".

    public double area(){
        return 0;
    }

    // what is the meaning of 'perimeter' in my own language is "cevre".

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
