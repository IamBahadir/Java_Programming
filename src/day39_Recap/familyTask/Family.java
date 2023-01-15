package day39_Recap.familyTask;

public class Family {

    public static void main(String[] args) {


        Parent dad = new Parent("Bahadır",36);
        System.out.println(dad);
        dad.work();

        System.out.println("-------------------------------------------");


        Parent mom = new Parent("Kalbinur",36);
        System.out.println(mom);
        mom.talk();

        System.out.println("-------------------------------------------");
        Child daughter = new Child("Defne",1,"Bear");
        System.out.println(daughter);
        daughter.play();
        daughter.setFavouriteToy("Ninja");
        daughter.play();


    }
}
