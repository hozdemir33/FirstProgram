public class Circle extends GraphObject{

    public double areaCircle(double x){
        return x*x*3.14;
    }



    @Override
    void draw() {
        System.out.println("You can draw a circle..");
    }

    @Override
    void shape() {

        System.out.println("The shape is Circle...");
    }
}
