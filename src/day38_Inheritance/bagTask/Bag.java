package day38_Inheritance.bagTask;

public class Bag {


    public String brand;
    public double price;


    public Bag(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return "Bag{" +
                "brand='" + brand + '\'' +
                ", price= $" + price +
                '}';
    }

    public void usingWhere(){
        System.out.println("Bags provide a safe and easy way to carry your belongings.");
    }


}
