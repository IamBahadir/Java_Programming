package day37_Inheritance.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, String jobTitle, int age, int ID, double salary) {
        super(name, jobTitle, age, ID, salary);
    }
    public void teach(){
        System.out.println(name+" is teaching.");
    }
}
