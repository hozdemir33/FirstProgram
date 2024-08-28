import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {


    public static void main(String[] args) {


        int[] numb = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println(numbers[1]); // output 2

        int[][] number1 = {
                {1, 2, 3}, {3, 4, 5}
        }; //multi demnetional arrays

        // System.out.println(number1[1] [2]); //output  5

        for (int num2 : numb) {
            //  System.out.println(num2);

        }

        //How to create an arrays

        int[] n = new int[3];

        //  System.out.println(n.length);// output 3

        n[0] = 1;
        n[1] = 2;
        n[2] = 3;

        for (int i = 0; i < n.length; i++) {
            // System.out.println(i);
        }

        //Looping Through an Array
        //You can use loops to iterate over array elements.

//Enhanced For Loop (also known as a "for-each" loop):

        for (int knum : n) {
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

        String[] a = {"k", "m", "b"};
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


        String[] ci = {"reno", "sacramento", "davis"};
        Arrays.sort(ci); //first you sort it and then print under the toString for sorting order
        System.out.println(Arrays.toString(ci));


        int[] age = {1, 4, 5, 8, 7};// please find the length of the array and then add them all to find total in Array.
        System.out.println(Arrays.toString(age));//this prints the [1,4,5,8,7]

        System.out.println(age[0]);//prints first number within the array
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);

        Arrays.sort(age);
        System.out.println(Arrays.toString(age));//Ascending order 1,4,5,7,8

        int newContainer = 0;

        for (int newAgeValue : age) {

            newContainer = newContainer + newAgeValue;

            //System.out.println(newAgeValue);//1,4,5,7,8 prints

        }

        System.out.println("The total length is ::" + age.length);
        System.out.println("Total is ::" + newContainer);


        int[] addNum = {2, 3, -4};
        System.out.println(Arrays.toString(addNum)); // [2, 3, -4]


        int sum = 0;
        for (int i = 0; i < addNum.length; i++) {
            // sum =sum+ addNum[i]; // Add each element to the sum
            sum += addNum[i];  //line 137 and 138 are the same
        }

        System.out.println("Sum of the elements: " + sum); // Output the sum


        int[] desOrder = { 1, 4, 100}; // descending order for these number

        Arrays.sort(desOrder);
        System.out.println(Arrays.toString(desOrder)); //1,3,4,6 ascending numbers for now


        // Step 1: Initialize a variable to hold the largest number
        int largest = desOrder[0];

        // Step 2: Loop through the array to find the largest number
        for (int i = desOrder.length - 1; i >= 0; i--) {

            if(desOrder[i]>largest){
                largest=desOrder[i];
                System.out.println("The largest number:::"+ largest);

            }

        }

        int [] num1= {1,2,3,4,5, 20, 30}; //This is how you get the duplicate elements from  two seperate arrays
        int [] num2={2,4,5,6,20,32,30};

        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num2.length; j++){

                if(num1[i]==num2[j]){
                    System.out.println("Duplicate numbers are ::"+num1[i]);

                }

            }

        }

    }
}








