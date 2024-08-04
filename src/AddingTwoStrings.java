public class AddingTwoStrings {

String name1;
String name2;


    public AddingTwoStrings(String name1, String name2){
        this.name1=name1;
        this.name2=name2;
    }

    public void addTwoString(String name1, String name2){

       // System.out.println(name1+name2);
    }

    public static void main(String[] args) {

       // AddingTwoStrings totalName=new AddingTwoStrings();
       // totalName.addTwoString("hasan","Ozdemir");

//   AddingTwoStrings newName=new AddingTwoStrings();
//   System.out.println(newName.name1+" "+newName.name2);

        AddingTwoStrings ne=new AddingTwoStrings("Burak", "Ozdemir");

        System.out.println(ne.name1+ " "+ ne.name2);



    }
}
