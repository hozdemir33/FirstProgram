public class HelloWorld {


   static String name(String a){
        return a;
    }

    static int age(){
       return 20;
    }

    void name(){
        System.out.println("this is my name:hamdi"); //this method does not NOT RETURN ANY VALUES.
    }





    public static void main(String[] args) {
       // System.out.printf("Hello World");

        System.out.println(name("hasan"));

        System.out.println(age());
       // System.out.println(name("hasan"));

        HelloWorld n1=new HelloWorld();

          n1.name();

    }
}
