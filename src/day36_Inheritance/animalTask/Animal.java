package day36_Inheritance.animalTask;

public class Animal {

    public String name, breed, color ,size ;
    public char gender;
    public int age;

    public void setInfo(String name, String breed, String color, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    // All those are common methods that we can use for all the child(sub) class.

    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void drink(){
        System.out.println(name+" is drinking.");
    }
    public void move(){
        System.out.println(name+" is moving.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


/*
Animal{

                    name, breed, gender, size, age, color

                    method :
                            eat(), drink(), move(), sleep(), toString(), ...

                     What benefit is going to give you = I do not have to declare the features one by one.
            }
 */