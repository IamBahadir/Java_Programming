package day43_Abstraction.employeeTask;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching.");

    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping on the small house.");

    }

    @Override
    public void eat() {
        System.out.println(getJobTitle()+" "+getName()+" is eating sandwich.");


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

}// end line of the Teacher Class
