package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal { // one of the child/sub class


    public Tiger(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer.");
    }

    // a method is special for Tiger, inherited WildAnimal
    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting.");
    }



}// end line of the Tiger class
