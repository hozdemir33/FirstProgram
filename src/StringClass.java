public class StringClass {

    String fname="Hamid";
    String lastName="lala";
    String middleName="Levent";

    String fname1;
    String lastName2;

    public void MyName(){
        System.out.println(fname+" " +lastName);
    }

    public StringClass(String fname1 , String lastName2){
        this.fname1=fname1;
        this.lastName2=lastName2;

    }

    public StringClass(String fname, String middleName, String lastName ){

        System.out.println(this.fname+this.middleName+this.lastName);

        this.fname=fname;
        this.middleName=middleName;
        this.lastName=lastName;

    }

    public static void main(String[] args) {

        //StringClass name1=new StringClass();
//       name1.fname="Hasan";
//        name1.lastName="Ozdemir";
//        name1.MyName();
       // System.out.println("My name is ::"+ name1.fname+" "+name1.lastName);

       // StringClass name2=new StringClass("Hasan", "Ozdemir");

       // System.out.println(name2.fname1+" "+name2.lastName2);
      //  name2.MyName();

        StringClass branNewNamewithMiddleName=new StringClass("halid", "levent","Ozdemir");

       System.out.println(branNewNamewithMiddleName.fname+" "+ branNewNamewithMiddleName.middleName+" "+branNewNamewithMiddleName.lastName);



    }
}
