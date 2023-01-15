package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {



        Employee e1 = new Employee("veli",35,'M',18000);


        e1.setName("bahadir");
        e1.setAge(36);
        e1.setGender('M');
        e1.setSalary(25000.00);

        System.out.println(e1.getName());
        System.out.println(e1.getGender());
        System.out.println(e1);

        Employee e2 = new Employee("",15,'q',-300);
        System.out.println(e2);

        e2.setName("kalbinur");
        e2.setAge(36);
        e2.setSalary(30000);
        e2.setGender('F');
        System.out.println(e2);






    }

}
