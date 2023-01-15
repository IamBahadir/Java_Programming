package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, int year, double price, String color, int miles) {
        super("Bmw", model, year, price, color, miles);
    }


    @Override
    public void start() {
        System.out.println(model+" "+brand+" is starting with press button.");
    }
}
