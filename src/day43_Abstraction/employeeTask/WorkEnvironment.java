package day43_Abstraction.employeeTask;

public class WorkEnvironment {

    public static void main(String[] args) {


        Developer developer = new Developer("bahadir",25,'M',1,"Full stack developer",350000);
        Tester tester = new Tester("ahmet",25,'M',2,"Full stack tester",250000);
        Teacher teacher = new Teacher("elisa",23,'F',3,"Soft skill teacher",175000);
        Driver driver = new Driver("jack",35,'M',4,123500);

        System.out.println("developer = " + developer);
        developer.work();
        developer.eat();
        developer.sleep();

        developer.setAge(35);

        System.out.println("developer = " + developer);

        developer.buildCode();


        System.out.println("----------------------------------------");

        System.out.println("tester = " + tester);
        tester.work();
        tester.eat();
        tester.sleep();

        tester.setName("jomolokko");

        System.out.println("tester = " + tester);

        tester.bugReport();


        System.out.println("----------------------------------------");

        System.out.println("teacher = " + teacher);
        teacher.work();
        teacher.eat();
        teacher.sleep();
        teacher.setSalary(145000);

        System.out.println("teacher = " + teacher);


        System.out.println("----------------------------------------");

        System.out.println("driver = " + driver);
        driver.work();
        driver.eat();
        driver.sleep();

        driver.setName("fazıl");

        System.out.println("driver = " + driver);



    }// end line of the Main Method

}// end line of the WorkEnvironment Class
