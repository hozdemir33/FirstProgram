import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {


    public static void main(String[] args) {



        int [] numb={1,2,3,4,5,6,7};
       // System.out.println(numbers[1]); // output 2

        int [] [] number1={
                {1,2,3}, {3,4,5}
                           }; //multi demnetional arrays

       // System.out.println(number1[1] [2]); //output  5

        for(int num2:numb){
            //  System.out.println(num2);

        }

       //How to create an arrays

        int [] n = new int[3];

      //  System.out.println(n.length);// output 3

        n[0]=1;
        n[1]=2;
        n[2]=3;

        for(int i=0; i<n.length;i++){
           // System.out.println(i);
        }

        //Looping Through an Array
        //You can use loops to iterate over array elements.

//Enhanced For Loop (also known as a "for-each" loop):

        for(int knum:n){
           // System.out.println(knum);
        }

//Mutidimentional arrays

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 2, 9}
        };


      //  System.out.println(matrix[2][0]);

        int[] newNumber = {1, 2, 3};
       // System.out.println(Arrays.toString(newNumber));  // Prints: [1, 2, 3]

       String [] a={"k", "m", "b"};
       // System.out.println(Arrays.toString(a));//prints :  [k,m,b]


        int[] a1 = {1, 2, 34};
        int[] b1 = {1, 2, 3};
      //  System.out.println(Arrays.equals(a1, b1));  // Prints: false


        int[] a11 = {1, 2, 3};
        int[] b11 = {1, 2, 3};
      //  System.out.println(Arrays.equals(a11, b11));//Prints: true


      //  int [] nn = new int [4];


//How to SORT AN ARRAY SIMPLY USING THE Arrays.sort(name of the arrays list)
                int[] numbers = {5, 3, 8, 1, 2};

                // Sorting the array in ascending order
                Arrays.sort(numbers);

                // Printing the sorted array
                System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 5, 8]


        String[] words = {"banana", "apple", "cherry", "date"};

        // Sorting the array in lexicographical order
       // Arrays.sort(words);

        // Printing the sorted array
        System.out.println(Arrays.toString(words));  // Output: [apple, banana,


        String [] ci={"reno","sacramento","davis"};
        Arrays.sort(ci); //first you sort it and then print under the toString for sorting order
        System.out.println(Arrays.toString(ci));





    }
}
