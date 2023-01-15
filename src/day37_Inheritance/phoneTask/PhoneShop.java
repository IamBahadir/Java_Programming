package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");

        Iphone iphone = new Iphone("13","Pro max",1500,"Red");

        System.out.println("iphone = " + iphone);

        iphone.faceTime(555555555);
        iphone.message(555555555);

        System.out.println("------------------------------------------");

        Samsung samsung = new Samsung("Galaxy","S22",1200,"Black");

        System.out.println("samsung = " + samsung);

        samsung.freeze();
        samsung.message(555555555);

        System.out.println("------------------------------------------");

        Nokia nokia = new Nokia("Lumia","520",100,"Grey");

        System.out.println("nokia = " + nokia);

        nokia.selfDefence();
        nokia.call(555555555);

        System.out.println("------------------------------------------");





    }


}
