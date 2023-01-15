package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{// is A Employee, and also is A Person.


    public BusinessAnalyst(String name, int age, char gender, double salary, int id, String companyName) {
        super(name, age, gender, "Business Analyst", salary, id, companyName);
    }


    public void analyze(){
        System.out.println(jobTitle+" "+name+" is analyzing a document.");
    }

}
