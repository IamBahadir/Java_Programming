package day39_Recap.departmentTask;

public class Employee extends Human { // employee is a Human. and also is a relation.


    // has its own attributes.

    private String jobTitle;
    private double salary;
    private long personalId;

    //In this example, the SubClass extends the SuperClass, which means it inherits all of the attributes of the superclass.

    public Employee(String name, int age, char gender, String jobTitle, double salary, long personalId) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        setPersonalId(personalId);
    }


    // to control value of variables its given by user.

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
        if (salary <= 0) {
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    public long getPersonalId() {
        return personalId;
    }
    public void setPersonalId(long personalId) {
        if (personalId <= 0) {
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.personalId = personalId;
    }

    @Override
    public void setAge(int age) {
        if (age<=15){
            System.err.println("You're unable to work at any company.");
            System.exit(0);
        }
        super.setAge(age);
    }

    // The sub class has its own method

    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working." );
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle=" + jobTitle +
                ", salary= $" + salary +
                ", personalId=" + personalId +

                '}';
    }
}
