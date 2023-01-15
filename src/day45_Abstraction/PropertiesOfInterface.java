package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200;



    static void method1(){
        System.out.println("static method");
    }

    void method2();

    default void method3(){
        System.out.println("method 3");
    }


}

class Test implements PropertiesOfInterface {



    @Override
    public void method2() {
        System.out.println("ahskjdhasd");
    }


    public static void main(String[] args) {

        PropertiesOfInterface.method1();
    }




}
