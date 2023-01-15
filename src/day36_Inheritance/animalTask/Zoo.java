package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.age = 2;
        dog1.breed = "husky";
        dog1.color = "black";
        dog1.gender = 'F';
        dog1.size = "Large";

        System.out.println(dog1);

        dog1.bark();
        dog1.sleep();

        System.out.println("-------------------------------------------------");

        Cat cat1 = new Cat();

        cat1.setInfo("Robin","British","Grey","Small",'F',5);

        System.out.println(cat1);

        cat1.scratch();

        cat1.sleep();







    }


}
