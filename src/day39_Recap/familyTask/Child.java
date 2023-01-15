package day39_Recap.familyTask;

public class Child extends Parent {

    private String favouriteToy;


    public Child(String name, int age, String favouriteToy) {
        super(name, age);
        this.favouriteToy = favouriteToy;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }


    public void play() {
        System.out.println(getName() + " is playing with " + favouriteToy + ".");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " is talking with dad.");
    }


}

