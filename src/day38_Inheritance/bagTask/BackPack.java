package day38_Inheritance.bagTask;

public class BackPack extends Bag{
    public BackPack(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void usingWhere() {

        System.out.println("A purse, also known as a handbag, is a bag used to carry money, wallets, phones, and other daily essentials. ");
    }
}
