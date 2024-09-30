public class FubinacciNumbers {

    /*


    The Fibonacci numbers are very useful for introducing algorithms,
     so before we continue, here is a short introduction to Fibonacci numbers.

     The Fibonacci numbers are named after a 13th century Italian mathematician known as Fibonacci.

     The two first Fibonacci numbers are 0 and 1, and the next
     Fibonacci number is always the sum of the two previous numbers,
     so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ...


     */

    public static int FubSum(int a){

        if(a<=1){
            return a;
        } else {
            return FubSum(a-1)+FubSum(a-2);
        }
    }

    public static void main(String[] args) {

       int a=8;

        System.out.println("Fibonacci of " + a  + " is: " + FubSum(a));



    }


}
