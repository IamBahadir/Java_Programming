package day39_Recap.cydeoTask;

public class Developer extends Employee {

    public Developer(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is fixing Bug.");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", employeeId=" + getEmployeeId() +
                ", jobTitle=" + getJobTitle() +
                ", salary=" + getSalary() +
                "}";
    }
}
