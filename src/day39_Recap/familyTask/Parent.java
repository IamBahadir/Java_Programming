package day39_Recap.familyTask;

import org.w3c.dom.css.CSSUnknownRule;

public class Parent {

    private String name;
    private int age;
    private final String surname = "Duzkalem";

    public Parent(String name, int age) {
        setName(name);
        setAge(age);
        // this.surname = surname; we cann't be added surname in the constructor. Because this is final. we cann't assign a new value of this variable.
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

// This method can be used just by parent

    public void work(){
        System.out.println(name+" is working.");
    }

    // This method can be overridden by sub class.

    public void talk(){
        System.out.println(name+" is talking.");
    }


    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +

                '}';
    }
}
