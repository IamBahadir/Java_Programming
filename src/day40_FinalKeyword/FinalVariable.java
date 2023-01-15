package day40_FinalKeyword;

public class FinalVariable {


    final String birthday;
    final static String name;

    public FinalVariable(String birthday) {
        this.birthday = birthday;

    }

    static {
        name = "Bahadır";
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        // pi = 4.14;

        // pi = 5.14;

        System.out.println("pi = " + pi);

        final String name = "Bahadır";
        // name = "Mehmet";
        // name = "Jack";
        // name = "Brandon";

        System.out.println(name);


        FinalVariable obj = new FinalVariable("June/02");
        FinalVariable obj1 = new FinalVariable("December/12");
        System.out.println(obj.birthday);

        // obj.birthday = "June/03"; There is no way to assign new value

        System.out.println(obj.name);
        System.out.println(obj1.name);

        // FinalVariable.name = "Baha"; There is no way to assign new value



    }

}
