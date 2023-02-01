package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {


        // odd number
        MyFirstFunctionalInterface oddOrEvenNumber = (no) -> {
            if (no % 2 == 0) {
                System.out.println(no + " is even number.");
            } else {
                System.out.println(no + " is odd number. ");
            }
        };

        oddOrEvenNumber.apply(0);


        // eligible to buy alcohol

        MyFirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
            if (age < 18) {
                System.out.println("Your age (" + age + ") is not eligible to buy alcohol.");
            } else {
                System.out.println("Your age (" + age + ") is eligible to buy alcohol.");
            }
        };

        eligibleToBuyAlcohol.apply(18);


        // cube of a number

        MyFirstFunctionalInterface printCube;

        printCube = (n) -> {
            System.out.println(n * n * n);
        };

        printCube.apply(3);

        // number is divisible 3 and 4

        MyFirstFunctionalInterface divisible3And4 = n -> {
            if (n % 12 == 0){
                System.out.println(n+" is divisible by 3 and 4.");
            }else {
                System.out.println(n+" is not divisible by 3 and 4.");
            }
        };

        divisible3And4.apply(24);


    }
}
