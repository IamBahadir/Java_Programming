package day39_Recap.cydeoTask;

import java.sql.SQLOutput;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("bahadir",'M',36,1,125000);
        System.out.println(tester);
        tester.work();

        System.out.println("----------------------");

        Developer developer = new Developer("Jack",'M',32,2,175000);
        System.out.println(developer);
        developer.work();

        System.out.println("----------------------");

        Teacher teacher = new Teacher("Joshua",'M',28,3,115000);
        System.out.println(teacher);
        teacher.work();

        System.out.println("----------------------");

        Student student = new Student("cindy",'F',21,5);
        System.out.println(student);



    }
}
