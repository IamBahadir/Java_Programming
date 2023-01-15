package day45_Abstraction.Shape;

public final class Rectangular extends Shape implements Perimeter{

    /*
    rectangular
        Area         : w*l
        perimeter    : 2 * ( w*l )

        class needed : width & length
     */



    private double width;
    private double length;

    public Rectangular(double width,double length) {
        super("Rectangular");
        setWidth(width);
        setLength(length);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new RuntimeException("Invalid value : "+width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            throw new RuntimeException("Invalid value : "+length);
        }
        this.length = length;
    }

    @Override // it comes from parent class
    public double area() {
        return width*length;
    }


    @Override // it comes from interface
    public double perimeter() {
        return 2*(width*length);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", length=" + length +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +

                '}';
    }
}// end line of the Rectangular class
