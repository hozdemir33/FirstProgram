import java.util.Scanner;

public class ScannerClass {



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Print a number::");
         int inputNumber=  sc.nextInt();


         if(inputNumber>50){
             System.out.println("SloW dOWN");
         } else {
             System.out.println("You are driving like a Turtle:::");
         }


    }
}
