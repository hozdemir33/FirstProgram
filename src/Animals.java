public class Animals  {

    public void barking(){
        System.out.println("some anumals bark like dogs:::");
    }


    public static void main(String[] args) {

        Birds b1=new Birds("birdy", "YELLOW", 36);

        b1.age=10;
        System.out.println(b1.getAge());

        Dogs dog=new Dogs();//creating a dog object  in here
        //dog.barking();

//        System.out.println(b1.getAge());
//        System.out.println(b1.getName());
//        System.out.println(b1.getColor());


        System.out.println("This is the bird's age:::"+ b1.getAge());

       dog.barking();//barking action for a dog

        Dogs d2=new Dogs();
     //   d2.barking();



     Birds birdy2=new Birds("Lulu","yellow", 230);

      birdy2.setAge(20);
      birdy2.setColor("blue bluish");
      birdy2.setName("lamda lamda bird");

        System.out.println(birdy2.getAge()+" "+birdy2.getName()+" "+birdy2.getColor());

       birdy2.flying();//this was a void methods

    }
}
