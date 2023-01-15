package day36_Inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char grade;
    private char gender;

    static String shcoolName;


    public Student(String name, int age, char grade, char gender) {
        setName(name);
        setAge(age);
        setGrade(grade);
        setGender(gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {

        if (name ==""){
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {

        if (age<5 || age>90){
            return;
        }

        this.age = age;
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {

        if ( !(grade=='A'|| grade=='B'|| grade=='C'|| grade=='D'|| grade=='F') ){
            return;
        }


        this.grade = grade;
    }

    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if ( ! (gender == 'F'|| gender== 'M') ){
            return;
        }
        this.gender= gender;
    }






    static{
        shcoolName = "Cydeo";
    }

    public void study(){
        System.out.println(name+" is studying Java Programming language at "+shcoolName );
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender=" + gender +
                ", school name=" + shcoolName +

                '}';
    }
}


/*

1. Create a class named Student:

            private variables:
                    name, gender, grade, schoolName

            Encapsulate all the fields (at least encapsulate two fields manually)

                    requirement:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any character other than: 'M' and 'F'
                        3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all the fields when the object is created

                    (requirements of fields in the above must be applied)


            Method:

                    study()
                    toString()
 */