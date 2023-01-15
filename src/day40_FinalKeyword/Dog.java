package day40_FinalKeyword;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void bark() {
        System.out.println(getName()+" is barking.");
    }

    /*
    public final void drink(){ // You're not gonna be able to override it. Because of the Final keyword
        System.out.println(name+" is drinking water.");
    }
    */


}
