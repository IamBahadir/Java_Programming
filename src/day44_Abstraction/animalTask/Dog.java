package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{ // if I want to create an object, it can not be abstract class.


    public Dog(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    public void bark(){
        System.out.println(getName()+" is barking.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating pizza.");
    }


    @Override
    public void play() {
        System.out.println(getName()+" plays.");
    }


}
