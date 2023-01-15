package day43_Abstraction.employeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }



    // this is a method that belong to the developer
    public void buildCode(){
        System.out.println(getJobTitle()+" "+getName()+" is building code.");
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing.");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping in the hotel.");

    }

    @Override
    public void eat() {
        System.out.println(getJobTitle()+" "+getName()+" is eating pizza.");

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


}// end line of the Developer Class
