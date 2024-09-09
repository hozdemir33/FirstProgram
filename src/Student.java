public class Student {

    String name;
    String lastName;
    int age;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    private int ssn;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName=lastName;
        this.age=age;


    }

    public Student(){

    }

}
