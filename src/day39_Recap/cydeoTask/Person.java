package day39_Recap.cydeoTask;

public class Person { // This is Parent class.


    private String name ;
    private char gender;
    private int age;


    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender== 'F' || gender == 'M')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <=15){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }


    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void drink(){
        System.out.println(name+" is drinking.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
