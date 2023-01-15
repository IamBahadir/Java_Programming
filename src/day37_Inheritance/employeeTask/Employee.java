package day37_Inheritance.employeeTask;

public class Employee {


    public String name, jobTitle;
    public int age, ID;
    public double salary;
    public static String companyName;

    public Employee(String name, String jobTitle, int age, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
    }

    static {
        companyName = "Disney Land";
    }

    public void work(){
        System.out.println(name+" is working at the "+companyName+"." );
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", salary= $" + salary +
                ", companyName=" + companyName +

                '}';
    }
}


/*

    name , age , jobTitle , ID , companyName , salary




 */