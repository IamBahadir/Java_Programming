package day37_Inheritance.scrumTask;

public class Developer extends Employee{ // Developer is A Employee, and also is A person.

    public Developer(String name, int age, char gender, String jobTitle, double salary, int id, String companyName) {
        super(name, age, gender, jobTitle, salary, id, companyName);
    }

    public void fixBug(){
        System.out.println(jobTitle+" "+name+" is fixing a Bug.");
    }

}
