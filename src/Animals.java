public class Animals {

    public void barking(){
        System.out.println("some anumals bark like dogs:::");
    }



    public static void main(String[] args) {

        Birds b1=new Birds("birdy", "YELLOW", 36);

        Dogs dog=new Dogs();//creating a dog object  in here
        dog.barking();

//        System.out.println(b1.getAge());
//        System.out.println(b1.getName());
//        System.out.println(b1.getColor());


        System.out.println(b1.getAge());







    }
}
