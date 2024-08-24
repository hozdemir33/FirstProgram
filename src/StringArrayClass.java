import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayClass {


    public static <integer> void main(String[] args) {


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


        System.out.println(fruits.contains("muz"));//false
        System.out.println(fruits.contains("Apple"));//true

        fruits.add("grapes");//adding grapes into the arraylist

        System.out.println(fruits);



        //How do you create an ArrayList to store integers in Java?
        // Write a code snippet to demonstrate.

        ArrayList<Integer> num=new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);

    //    System.out.println(num);

        String h="apple";

     for(String neFruitss:fruits ){
         System.out.println(neFruitss);//OUTPUT is ::: Apple, Banana, Orange, grapes


         if(neFruitss.equalsIgnoreCase(h)){
             System.out.println("true");
             break;

         }else {
             System.out.println("false");
         }

        }

     }

    }

