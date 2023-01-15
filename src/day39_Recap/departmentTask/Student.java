package day39_Recap.departmentTask;

public class Student extends Human { // Student is not an Employee,but is a Human. and also is a relation with Human.

    // has its own attributes
    private long studentId;
    private String program;



    // the subclass extend of supclass which means its inherit of all attributes and methods.

    public Student(String name, int age, char gender, long studentId, String program) {
        super(name, age, gender);
        setStudentId(studentId);
        setProgram(program);
    }


    // to control value of variables its given by user.

    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        if (studentId <= 0) {
            System.err.println("Invalid Id");
            System.exit(0);
        }
        this.studentId = studentId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void setAge(int age) {
        if (age>25){
            System.err.println("You're unable to get any programs from this department.");
            System.exit(0);
        }
        super.setAge(age);
    }

    @Override
    public void think() {
        System.out.println(getName()+" is thinking.");
    }
    @Override
    public void breath() {
        System.out.println(getName()+" takes a breath outside of the department.");
    }

    public void study() {
        /* method implementation */
        System.out.println(getName() + " studies " + getProgram() + ".");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", program=" + program +
                '}';
    }
}
