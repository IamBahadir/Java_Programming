package day39_Recap.cydeoTask;

public class Tester extends Employee {


    public Tester(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Tester", salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing.");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", employeeId=" + getEmployeeId() +
                ", jobTitle=" + getJobTitle() +
                ", salary=" + getSalary() +
                "}";
    }
}
