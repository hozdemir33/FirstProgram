import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        String name = "MOMMY";
        String revName = "";

        for(int i=name.length()-1; i>=0; i--){

            revName=revName + name.charAt(i);

        }

        System.out.println(revName);

        if(revName.equals(name)){
            System.out.println("It is a PALINDROME..");

        } else{

            System.out.println("Not a PALINDROME...");

        }

    }

}
