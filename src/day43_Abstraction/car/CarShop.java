package day43_Abstraction.car;

public class CarShop {


    public static void main(String[] args) {


    // Car car1 = new Car("Tesla","Y","White",2020,20000);
    // Car' is abstract; cannot be instantiated


        Audi audi = new Audi("R8","Black",2022,220000);
        Honda honda = new Honda("Accord","Black",2019,30000);
        Tesla tesla = new Tesla("X","White",2021,49000);


        System.out.println("audi = " + audi);
        System.out.println("honda = " + honda);
        System.out.println("tesla = " + tesla);

        honda.stop();


    }// end line of the Class Main
}// end line of the Class CarShop
