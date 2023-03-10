package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public  char gender;
    public int age , batchNumber , groupNumber;
    public String fieldOfStudy;


    public static String schoolName;
    public static String programmingLanguage;

    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";

    }

    public static void printProgrammingLanguage(){
        System.out.println("Language is : "+programmingLanguage);
    }
    public static void printSchoolName(){
        System.out.println("School's name is : "+schoolName);
    }
    public static void printSecretCode(){
        System.out.println("Code is : "+secretCode);
    }
    public void attendClass(){
        System.out.println(name+" is attending to class.");
    }
    public void study(){
        System.out.println(name+" is studying Code.");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", secretCode='" + secretCode + '\'' +

                '}';
    }
}



/*

2. create a class name CybertekStudent

       Variables:
            name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage

       Add a constructor to initialize all the fields

       Add a static block to initialize all the statics

       methods:

       attendClass()
       study()
       toString()
 */