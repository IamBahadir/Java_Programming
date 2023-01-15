package day37_Inheritance.bankBranch;

public class RelationshipManager extends Employee{

    public RelationshipManager(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, "RelationshipManager", ID, salary);
    }

    public void gettingClient(){
        System.out.println(jobTitle+" "+name+" is get a new Client.");
    }


}
