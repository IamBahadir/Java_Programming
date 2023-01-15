package day38_Inheritance.bagTask;

public class BabyBag extends Bag {


    public BabyBag(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void usingWhere() {
        System.out.println("Put the baby inside in a comfortable position and close the remaining buckles.");

    }
}
