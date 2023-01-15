package day39_Recap.cydeoTask;

public class Teacher extends Employee {


    public Teacher(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", employeeId=" + getEmployeeId() +
                ", jobTitle=" + getJobTitle() +
                ", salary=" + getSalary() +
                "}";
    }
}
