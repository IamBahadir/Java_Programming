package day39_Recap.departmentTask;

public class Department {


    public static void main(String[] args) {

        Student student1 = new Student("Baha", 16, 'M', 101, "Economy");
        System.out.println(student1);
        student1.study();
        student1.think();
        student1.breath();
        student1.setProgram("Software Engineer");
        System.out.println(student1);

        // student1.setAge(26); if I assign any value upper than 25 the intellij gives me a complire message
        // "You're unable to get any programs from this department."
        System.out.println(student1);

        System.out.println("-------------------------------------------------------------------------------");

        Employee employee1 = new Employee("Bahadır", 16, 'M', "Tester", 155000, 10);
        System.out.println(employee1);
        // employee1.setAge(15);   if I assign any value less than 16 the intellij gives me a complire message
        // "You're unable to work at any company."

        employee1.work();
        employee1.think();
        employee1.breath();


    }


}
