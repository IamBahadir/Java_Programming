package day39_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, int employeeId, String jobTitle, double salary) {
        super(name, gender, age);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    //These are the getter and setter method for attributes we created under the Employee class

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void work(){
        System.out.println(getName()+" is working.");
    }

    // We modify (Override) the toString Method.

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", employeeId=" + employeeId +
                ", jobTitle=" + jobTitle +
                ", salary=" + salary +
                '}';
    }


}
