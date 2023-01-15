package day36_Inheritance.encapsulation;

public class StudentObjects {


    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------------");

        Student stud1 = new Student("Bahadr", 4, 'F', 'T');

        System.out.println(stud1);

        System.out.println("-----------------------------------------------------------------------");

        stud1.setName("Bahadir");
        stud1.setAge(36);
        stud1.setGender('M');
        stud1.setGrade('A');

        System.out.println(stud1);

        System.out.println("-----------------------------------------------------------------------");

        stud1.study();

        System.out.println("-----------------------------------------------------------------------");


    }

}
