public class Vehicles {



    public static void main(String[] args) {

        Cars c1 = new Cars("Ford", "impala", 2024, "Yellow");

        c1.setColor("blue");
        c1.setMake("Honda");
        c1.setModel("fit");

        System.out.println(c1.getColor());
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());


        Cars c2 = new Cars("Kia", "Sedona", 2010, "Blue");

        System.out.println(c2.getColor() + " " + c2.getMake() + " " + c2.getModel() + " " + c2.getYear());

        Cars c3 = new Cars();//None parametized constructor

        c3.setModel("Tesla");

        System.out.println("This is the Electric car:::" + c3.getModel());


    }

}
