package day38_Inheritance.bagTask;

public class bagStore {

    public static void main(String[] args) {


        BabyBag babyBag = new BabyBag("Vakko", 1000);
        HandBag handBag = new HandBag("Adidas", 2500);
        BackPack backPack = new BackPack("Nike", 1500);


        babyBag.usingWhere();
        handBag.usingWhere();
        backPack.usingWhere();


    }


}
