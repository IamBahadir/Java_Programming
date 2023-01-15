package day37_Inheritance.bankBranch;

public class Person { // class of the person is an example of Parent class


    public String name;
    public int age;
    public char gender;


    public static String companyName;


    static {
        companyName = " Yapı ve Kredi Bankası A.Ş. ";
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void talk(){
        System.out.println(name+" is talking.");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", companyName =" + companyName +

                '}';
    }
}
