package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable, Flyable{ // one of the child class


    public Parrot(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    // A method that is special for the Parrot 
    public void whistle(){
        System.out.println(getName()+" is whistling.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate.");
    }

    // a method is special for Parrot, inherited Playable
    @Override
    public void play() {
        System.out.println(getName()+" plays.");
    }

    // a method is special for Parrot, inherited Flyable
    @Override
    public void fly() {
        System.out.println(getName()+" flies.");
    }

}// end line of the class
