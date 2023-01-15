package day38_Inheritance.carTask;

public class Park {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla",2015,12500,"red",115000);
        Tesla tesla  = new Tesla("Model x",2021,27500,"White",27500);
        BMW bmw = new BMW("M5",2021,74000,"Blue",2019);



        toyota.start();
        tesla.start();
        bmw.start();




    }
}
