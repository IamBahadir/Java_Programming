package day44_Abstraction.animalTask;

public abstract class Animal { // Parent Class


    /*
    Create an abstract class named Animal:
                Variables:
                            name, breed(final), gender(final), age, size, color(final)

                            Encapsulate all the fields

                            Add a constructor that can set all the fields

                            Methods:
                                    eat():      different animal eat different foods
                                    drink():    all the animal drink water
                                    toString(): to display the full intro of the animal
     */


    private String name;
    private final String breed,color;
    private final char gender;
    private int age;
    private char size;

    public final static boolean canBreath; // can not be able to re-assign


    public Animal(String name, String breed, String color, char gender, int age, char size) {
        setName(name);
        this.breed = breed;
        this.color = color;
        if (!(gender=='F'||gender=='M')){
            throw new RuntimeException("Invalid gender : "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
    }

    static {
        canBreath = true;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Age can not be less than zero");
        }
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (!(size== 'M'||size=='S'||size=='L')){
            System.out.println("Invalid size : "+size);
        }
        this.size = size;
    }


    public abstract void eat(); // it can not be final or static and does not have any body.

    public void drink(){
        System.out.println(name+" is drinking water.");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                '}';
    }




}// end line of the Animal Class
