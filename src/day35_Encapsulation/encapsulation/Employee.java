package day35_Encapsulation.encapsulation;


public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    // There is a possibilities to generate directly under the GenerateButton

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if ( name.isEmpty() ){
            return;
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 16 || age > 120) {
            return;
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if ( salary <= 0){
            return;
        }

        this.salary = salary;
    }




    /*
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

   */
    /*
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    */

}
