package day37_Inheritance.employeeTask;

public class Office {

    public static void main(String[] args) {


        System.out.println("------------------------------------------------------------------");

        Tester tester = new Tester("Bahadir","Tester",36,1234,120000);
        System.out.println(tester);
        tester.test();
        tester.work();

        System.out.println("------------------------------------------------------------------");

        Developer developer = new Developer("kalbinur","Dev",36,1235,275000);
        System.out.println(developer);
        developer.improve();
        developer.work();

        System.out.println("------------------------------------------------------------------");

        Teacher teacher = new Teacher("Usuain Bolt","Teacher",48,1236,178500);
        System.out.println(teacher);
        teacher.work();
        teacher.teach();

        System.out.println("------------------------------------------------------------------");

        Driver driver = new Driver("Ricky","Driver",32,1237,95000);
        System.out.println(driver);
        driver.work();

        System.out.println("------------------------------------------------------------------");









    }
}
