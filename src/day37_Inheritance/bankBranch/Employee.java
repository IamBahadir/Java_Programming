package day37_Inheritance.bankBranch;

public class Employee extends Person { // Employee is A Person, and also is A sub or child class

    public String jobTitle ;
    public int ID;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;

    }


    public void work(){
        System.out.println(name+" is working.");
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName =" + companyName +
                '}';
    }
}
