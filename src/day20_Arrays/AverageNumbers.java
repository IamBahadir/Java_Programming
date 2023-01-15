package day20_Arrays;

public class AverageNumbers {


    public static void main(String[] args) {


        int [] numbers = {10,20,30,40,50,60};

        int max = numbers[0];
        int min = numbers[0];
        int total = 0;


        for (int each : numbers) {
            if (max<each){
                max=each;
            }
            if (min>each){
                min=each;
            }
            total+=each;
        }

        int sum = total/ numbers.length;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("total = " + total);
        System.out.println("sum = " + sum);

    }

}
