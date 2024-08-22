import java.util.ArrayList;

public class ArrayListClass {


    public static void main(String[] args) {

//ArrayList is more flexiable than Array

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        /*

        1-> Arrays are fixed in size, so adding and removing elements requires
        creating a new array and copying elements.

        2-> ArrayList is dynamic and provides built-in methods for adding, removing, and searching elements, making it easier to work with dynamic collections.

         */



    }
}
