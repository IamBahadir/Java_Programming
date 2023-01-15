package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26];  //Z~A




        /*        i     ch
        alphabets[0] = 'Z'; //90
        alphabets[1] = 'Y'; //89
        alphabets[2] = 'X'; //88
            ...
        */


        char ch = 'Z'; // Z ..... A
        //                     26
        for (int i = 0; i < alphabets.length; i++, ch--) { // Z Y X W....A
            alphabets[i] = ch; // 0 -- > Z  , 1 -- > Y .......

        }



        char ch1 = 'A';

        for (int i = 0; i < alphabets.length; i++,ch1++) {
            alphabets[i] = ch1;
        }

        System.out.println(Arrays.toString(alphabets));








        char chs = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = chs;
        }


        for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) {
            alphabets[i] = j;
        }


        System.out.println(alphabets);
        System.out.println(Arrays.toString(alphabets)); // print the whole array
        System.out.println(alphabets[0]); // printing the element of array


    }


}