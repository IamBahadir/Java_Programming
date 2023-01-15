package day45_Abstraction.Shape;

public interface Volume {


    boolean hasVolume = true;

    default void method(){
        System.out.println("Default method");
    }

    double volume();



}
