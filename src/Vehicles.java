public class Vehicles {


    public static void main(String[] args) {

       Cars c1=new Cars("Ford","impala",2024, "Yellow");

        c1.setColor("blue");
        c1.setMake("Honda");
        c1.setModel("fit");

        System.out.println(c1.getColor());
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());


        Cars c2=new Cars("Kia","Sedona",2010,"Blue");





    }
}
