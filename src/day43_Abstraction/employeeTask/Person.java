package day43_Abstraction.employeeTask;

public abstract class Person { // Grandparent class

    /*
    abstract Person :
            name, age, gender(final)

            eat();
            sleep();
     */

    private String name;
    private int age;
    private final char gender;


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        if (!(gender=='F' || gender=='M')){
            throw new RuntimeException("Invalid gender : "+gender);
        }
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<15){
            throw new RuntimeException("Age can not be less than 15!!");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }



    public abstract void sleep();
    public abstract void eat();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}// end line of the Class Person
