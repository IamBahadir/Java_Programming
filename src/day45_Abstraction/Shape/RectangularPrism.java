package day45_Abstraction.Shape;

public final class RectangularPrism extends Shape implements Volume { // one of the child class


    /*
    Rectangular prism

        surface Area : 2(w*l+h*l+h*w)
        Volume       : w*h*l

        class needed : width & height & length
     */
    private double width;
    private double height;
    private double length;

    public RectangularPrism(double width, double height, double length) {
        super("Rectangular Prism");
        setWidth(width);
        setHeight(height);
        setLength(length);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Invalid value : " + width);
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Invalid value : " + height);
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid value : " + length);
        }
        this.length = length;
    }

    @Override // it comes from parent class
    public double area() {
        return 2 * ((width * length )+ (height * length) + (height * width));
    }

    @Override// it comes from interface
    public double volume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        return "RectangularPrism{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }
}// end line of the RectangularPrism class
