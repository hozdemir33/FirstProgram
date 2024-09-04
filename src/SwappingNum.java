public class SwappingNum {


    public static void main(String[] args) {

// THIS IS THE INITILIZATION OF THE INPUT VALUES FOR EACH VARIABLE

        int a=2;
        int b=8;
        System.out.println("a value is::"+a +" " + "b value is:::"+ b);

//OUTPUT NEEDS TO BE LIKE int a=8;   int b=2;

        int temp=0;  //initialized this temp bucket and then use it around for variable a and b.

            temp=b;
            b=a;
            a=temp;


        System.out.println("The int b output now::"+ a +" " + "The int a output is ::"+b);







    }
}
