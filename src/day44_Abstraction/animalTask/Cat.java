package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{ // one of the child class


    public Cat(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    public void meow(){
        System.out.println(getName()+" meows.");
    }



    @Override
    public void eat() {
        System.out.println(getName()+" is eating Biryani.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" plays.");
    }


}// end line of the CAT class
