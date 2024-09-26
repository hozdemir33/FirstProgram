import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Arrays1 {

    public static void main(String[] args) {



                int[] num = {1, 2, 3};
                int newElement = 4;

                // Create a new array with one more element than the original
                num = Arrays.copyOf(num, num.length + 1);

                // Insert the new element at the end
                num[num.length - 1] = newElement;

                // Print the updated array
                System.out.println(Arrays.toString(num));  // Output: [1, 2, 3, 4]



        //2nd WAY IS to add a num value with a ArraysList

        ArrayList<Integer>num1=new ArrayList<Integer>(Arrays.asList(1,2,3));//asList interface is used

        num1.add(4);

        System.out.println(num1);


        //linkedList

        LinkedList<Integer>num2= new LinkedList<>(Arrays.asList(1,2,3));//asList interface used to add this num 4 into num2.

        num2.add(4);

        System.out.println(num2);



            }
        }
