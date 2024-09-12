public class Student extends Human {

    String studentName;

    public Student(){
        this.studentName="this is a student::";
    }

    @Override
    public void firstName() {
        System.out.println("this is student first name");
    }

    @Override
    public void lastName() {
        System.out.println("this is last name of students");

    }
}
