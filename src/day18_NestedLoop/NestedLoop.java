package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {
/*

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
*/

        System.out.println("-------------------------------------------------");

        for (int j = 0; j < 3; j++) { // j: 0, 1, 2, 3

            for (int i = 0; i < 2; i++) { //i: 0,1,2,3,4
                System.out.println("Wooden Spoon");
            }

        }




    }

}
