package day37_Inheritance.scrumTask;

public class Tester extends Employee { // What is a relation : // is A Employee, and also is A Person.

    public Tester(String name, int age, char gender, String jobTitle, double salary, int id, String companyName) {
        super(name, age, gender, jobTitle, salary, id, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating a ticket.");
    }

}
