public class Maintainer {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();//these are from the abstract class method
        c.shape();//these are from the abstract class method

        Square s1 = new Square();
        s1.draw();
        int newSquareArea = s1.squarArea(3);
        System.out.println("The area of a square is :::" + newSquareArea);

        int newCalcSquareArea = s1.squarArea(77);
        System.out.println("The area of a new square is :::" + newCalcSquareArea);


        Circle c1 = new Circle();
        c1.draw();
        double newCircleArea = c1.areaCircle(22);
        System.out.println("This is the circle areas:::" + newCircleArea);

        Triangle t1 = new Triangle();
        int newTriangleArea = t1.areaTriangle(10);
        System.out.println("The triangle's area is ::" + newTriangleArea);

        Rectangle r1 = new Rectangle();
        int newRectangle = r1.rectangleArea(23);
        System.out.println("This is the new rectangle's area:::" + newRectangle);


           CharacterPTheRules w1=new Worrier();

           //interface class for "CharacterPTheRules"

           w1.attach(); //interface implementation
           w1.defend();// interface implementation


           CharacterPTheRules wiz1=new Wizards();

           wiz1.attach();//interface implementation
           wiz1.defend();// interface implementation

    }
}
