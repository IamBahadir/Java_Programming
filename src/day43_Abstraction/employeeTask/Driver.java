package day43_Abstraction.employeeTask;

public final class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "driver", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is driving.");

    }

    @Override
    public void sleep() {

        System.out.println(getJobTitle()+" "+getName()+" is sleeping in the cabin.");

    }

    @Override
    public void eat() {
        System.out.println(getJobTitle()+" "+getName()+" is eating soup.");

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



}// end line of the Driver Class
