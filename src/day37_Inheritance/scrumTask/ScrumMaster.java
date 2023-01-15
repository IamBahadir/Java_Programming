package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee { // is A Employee, and also is A person.


    public ScrumMaster(String name, int age, char gender, double salary, int id, String companyName) {
        super(name, age, gender, "Scrum Master", salary, id, companyName);
    }



}
