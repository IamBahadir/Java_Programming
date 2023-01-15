package day39_Recap.cydeoTask;

public class Student extends Person{

    private int studentId;

    public Student(String name, char gender, int age, int studentId) {
        super(name, gender, age);
        setStudentId(studentId);
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", studentId=" + studentId +

                '}';
    }
}
