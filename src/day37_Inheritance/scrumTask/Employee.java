package day37_Inheritance.scrumTask;

public class Employee extends Person { // What is a relation : Employee is A person.

    public String jobTitle;
    public double salary;
    public int id;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.companyName = companyName;
    }

    public void work() {

        System.out.println(name + " is working at the " + companyName + ".");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", companyName='" + companyName + '\'' +

                '}';
    }
}
