package day16_ForLoopStringPractice;

public class Aantreman {
    public static void main(String[] args) {

/*
        String str = "Bahadir.Duzkalem1986@cydeo.com";

        String digits = ""; //12345
        String lowerCase = "";
        String upperCase = ""; // CydeoWoodenSpoon
        String specialChars = ""; //!@#$%


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCase += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCase += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("upperCase = " + upperCase);
        System.out.println("specialChars = " + specialChars);

*/
        System.out.println("-----------------------------------------------------------");

        /*
        boolean isPalindrome = false;


        String letters = "leveL";

        String reversed = "";


        for (int i = letters.length()-1; i >= 0; i--) {
            reversed +=""+letters.charAt(i);

            if (reversed.equals(letters)){
                isPalindrome=true;
            }

        }
        System.out.println(isPalindrome);

         */

        System.out.println("-----------------------------------------------------------");

 /*
        String duplicated = "AAABBCCDD"; // -->> "ABC"
        String newLine = "";


        for (int i = 0; i < duplicated.length(); i++) {
            String str =""+ duplicated.charAt(i);

            if (!newLine.contains(str)){
                newLine+=str;

            }
        }
        System.out.println(newLine);

*/


        System.out.println("-----------------------------------------------------------");

        String str = "aaabccc";
        //            0123456

        String result = ""; //"b"

        // how can ı find the unique element

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result+=ch;
            }

        }
        System.out.println(result);


    }
}
