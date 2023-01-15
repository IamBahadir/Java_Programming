package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal ,Flyable { // one of the child class


    public Eagle(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }



    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake.");
    }

    // a method is special for Eagle, inherited WildAnimal
    @Override
    public void hunt(){
        System.out.println(getName()+" is hunting.");
    }

    // a method is special for Eagle, inherited Flyable
    @Override
    public void fly() {
        System.out.println(getName()+" flies.");
    }


}// end line of the Eagle class
