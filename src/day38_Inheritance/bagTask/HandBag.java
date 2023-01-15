package day38_Inheritance.bagTask;

public class HandBag extends Bag{
    public HandBag(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void usingWhere() {
        System.out.println("Backpacks are commonly used by hikers and students");
    }
}
