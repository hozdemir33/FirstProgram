public class FibonacciNumber {

    /*


    The Fibonacci numbers are very useful for introducing algorithms,
     so before we continue, here is a short introduction to Fibonacci numbers.

     The Fibonacci numbers are named after a 13th century Italian mathematician known as Fibonacci.

     The two first Fibonacci numbers are 0 and 1, and the next
     Fibonacci number is always the sum of the two previous numbers,
     so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ...


     */

    public static int fubSum(int a){ //Recursion to solve it first

        if(a<=1){

            return a;

        } else {

            return fubSum(a-1)+fubSum(a-2);

        }

    }

    public int f(int x){ //without using stating within the method body, but need to create an object to run it.
        //return x;

        if(x<=1){
            return x;
        }else {
            return f(x-1)+f(x-2);
        }
    }

    public static void main(String[] args) {

       int a=10;

        System.out.println("The Fibonacci of " + a  + " is" + " " + fubSum(a));


        FibonacciNumber ff=new FibonacciNumber();

       int fibonumberSum= ff.f(10);

       System.out.println("This is the fibo num::" + " " +fibonumberSum+  ".");



        }



    }



