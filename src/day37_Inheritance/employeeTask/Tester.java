package day37_Inheritance.employeeTask;

public class Tester extends Employee {


    public Tester(String name, String jobTitle, int age, int ID, double salary) {
        super(name, jobTitle, age, ID, salary);
    }

    public void test(){
        System.out.println(name+" is testing.");
    }

}
