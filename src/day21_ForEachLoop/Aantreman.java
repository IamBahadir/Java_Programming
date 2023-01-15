package day21_ForEachLoop;

import java.util.Arrays;

public class Aantreman {


    public static void main(String[] args) {

        String [] names = {"baha","baha","kalben","kalben","defny"};


        for (String each : names) {

            int count = 0;

            for (String element : names) {

                if (element == each){
                    count++;
                }

            }
            if (count==1){
                System.out.println(each);

            }




        }







    }

}
