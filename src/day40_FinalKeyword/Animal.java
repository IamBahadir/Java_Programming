package day40_FinalKeyword;

import javax.lang.model.element.AnnotationMirror;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }


    // There is only 3 options

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // There is method

    public void bark(){
        System.out.println("it is barking.");
    }

    public final void drink(){
        System.out.println(name+" is drinking water.");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }



}

