package day39_Recap.shapeTask;

public class Circle extends Shape{

    private double r;
    public static double pi = 3.14 ;

    public Circle(double r) {
        super("Circle");
        setR(r);
    }


    public double getR() {
        return r;
    }
    public void setR(double r) {
        if (r <=0){
            System.err.println("Invalid r");
            System.exit(1);
        }
        this.r = r;
    }



    @Override
    public double area() {
        return pi*r*r;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "r='" + r + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}
