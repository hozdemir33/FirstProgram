import java.util.Arrays;

public class DuplicateNumbers {


    public static void main(String[] args) {

        int [] num={3,2,3,0,-3}; // int array and goal is to find duplicate numbers

        for(int i=0;i<num.length;i++){
            for(int j=i+1; j<num.length; j++){

                if(num[i]==num[j]){

                    System.out.println("The duplicated numbers are::::"+ num[i]);


                }
            }
        }


    }
}
