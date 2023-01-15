package day37_Inheritance.bankBranch;

public class Manager extends Employee{


    public Manager(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, "Manager", ID, salary);
    }


    public void arrangeMeeting(){
        System.out.println(jobTitle+" "+name+" is arranging a meeting.");
    }

}
