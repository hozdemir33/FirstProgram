public class StingClass {


    public static void main(String[] args) {

        String name = "OZDEMIR";
        //StringBuilder rev= new StringBuilder();
        String reversedString = "";

        for(int i=name.length()-1;i>=0;i--){

            reversedString=reversedString+name.charAt(i);

        }
        System.out.println(reversedString);


    }
}
