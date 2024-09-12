public class RunnerClass {

    public static void main(String[] args) {

        Teacher t1=new Teacher();
        System.out.println(t1.teacherRole);

        t1.firstName();


        Student s1=new Student();
        s1.firstName();
        s1.lastName();

        Father f1=new Father();
        f1.firstName();
        f1.lastName();
        f1.fatherName="Mehmet";
        System.out.println("My name is::" + f1.fatherName);



    }
}
