package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee { // is A Employee, and also is A Person.

    public ProductOwner(String name, int age, char gender, double salary, int id, String companyName) {
        super(name, age, gender, "Product Owner", salary, id, companyName);
    }

}
