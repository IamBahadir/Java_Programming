package day37_Inheritance.phoneTask;

public class Phone { // It is going to be supperClas


    // Only the common features that you need to give.
    // Common features must be given under the Parent ( Super ) Class
    // For instance, every each phone has a price.

    public String brand, model, size;
    public double price;
    public String color;


    public static boolean hasBattery;


    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    static {
        hasBattery = true;
    }


    public void call(long phoneNumber) {
        System.out.println(brand + " is calling " + phoneNumber + ".");
    }
    public void message(long phoneNumber){
        System.out.println(brand+" is sending a message "+phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +

                '}';
    }
}
