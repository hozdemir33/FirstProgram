public class Teacher extends Human{

String teacherRole;

public Teacher(){
    this.teacherRole="this is a teacher";
}


    @Override
    public void firstName() {
        System.out.println("This is the teacher's name");

    }

    @Override
    public void lastName() {
        System.out.println("This is the last Name of the teacher");

    }
}
