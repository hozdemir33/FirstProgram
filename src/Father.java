public class Father extends Human {

String fatherName;

public Father(){
    this.fatherName="i am a father";

}

public String FatherName(String name){
    //this.fatherName="Mehmet";
    return name;
}

    @Override
    public void firstName() {
        System.out.println("this is the first name of father");
    }

    @Override
    public void lastName() {
        System.out.println(" this is the last name of father");

    }
}
