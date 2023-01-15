package day45_Abstraction.Shape;

public final class Triangle extends Shape implements Perimeter {
    /*
    Triangle
        Area         : ( h*b ) / 2
        perimeter    : a+b+c

        class needed : height & side1 & side2 & base
     */


    private double side1;
    private double side2;
    private double base;

    public Triangle(double side1, double side2, double base) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setBase(base);

    }




    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        if (side1 <= 0) {
            throw new RuntimeException("Invalid value : " + side1);
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new RuntimeException("Invalid value : " + side2);
        }
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if (base <= 0) {
            throw new RuntimeException("Invalid value : " + base);
        }
        this.base = base;
    }






    @Override // it comes from interface
    public double perimeter() {
        return side1 + side2 + base;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", base=" + base +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
