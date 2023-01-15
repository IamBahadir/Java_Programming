package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person();

        // person1.name = "Bahadir" We dont have directly access to modifier.
        // person1.age
        person1.setAge(36);
        person1.setName("Bahadır");

        System.out.println("Person name is: "+ person1.getName());

        System.out.println("Person age is: "+ person1.getAge());


    }


}
