package day39_Recap.departmentTask;



public class Human { // Parent class


    // "These attributes can exist for every human in the department."


    private String name;
    private int age;
    private char gender;


    //

    public Human(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);

    }


    // to control value of variables its given by user.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender== 'F'||gender == 'M')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }



    // The supper class has its own methods.

    public void think(){
        System.out.println(name+" is thinking.");
    }
    public void breath(){
        System.out.println(name+" takes a deep breath outside of office. ");
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
