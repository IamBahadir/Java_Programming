package day43_Abstraction.employeeTask;

public abstract class Employee extends Person { // parent class


    /*
    abstract Employee extends Person :

    id(final), jobTitle, salary..

    public abstract work(); // it can not be final and static , does not have any body

    and also abstract method can only be created in an abstract class or in an interface


     */

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id<=0){
            throw new RuntimeException("Id can not be less than one!!");
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
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

        if (salary < 0){
            throw new RuntimeException();
        }
        this.salary = salary;
    }


    public abstract void work(); // it can not be final and static , does not have any body

    // and also abstract method can only be created in an abstract class or in an interface


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


}// end line of the Class Employee
