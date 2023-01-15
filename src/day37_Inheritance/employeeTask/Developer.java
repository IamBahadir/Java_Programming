package day37_Inheritance.employeeTask;

public class Developer extends Employee {


    public Developer(String name, String jobTitle, int age, int ID, double salary) {
        super(name, jobTitle, age, ID, salary);
    }

    public void improve(){
        System.out.println(name+" is improving.");
    }

}
