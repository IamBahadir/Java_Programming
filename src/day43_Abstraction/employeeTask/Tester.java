package day43_Abstraction.employeeTask;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    // this is a method that belong to the tester
    public void bugReport(){
        System.out.println(getJobTitle()+" "+getName()+" is preparing a bug report.");
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the software application.");

    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping in their own home.");

    }

    @Override
    public void eat() {
        System.out.println(getJobTitle()+" "+getName()+" is eating hamburger");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary= $" + getSalary() +
                '}';
    }
}
