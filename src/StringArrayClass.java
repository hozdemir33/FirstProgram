import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayClass {


    public static void main(String[] args) {


        String [] letters={"a","c","b"};

        Arrays.sort(letters);
       // System.out.println(Arrays.toString(letters));//output is {a,b,c }


        String [] let1={"a", "b", "c"};
        String [] let2={"k", "a", ""};

        for(int i=0; i<let1.length;i++) {
            for (int j = 0; j < let2.length; j++) {

                if (let1[i].equals(let2[j])) {
                    //  System.out.println("same letters are::"+let1[i]);


                }
            }
        }

// Create an ArrayList to hold String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println(fruits);  // Output: [Apple, Banana, Orange]



    }

}
