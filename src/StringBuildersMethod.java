public class StringBuildersMethod {



    public String RevName(String name){
        return name;

    }

    public String StringBuildersMethod(String name2){
        return name2;
    }

    public static void main(String[] args) {

        //String name="Hasan";

        StringBuildersMethod n=new StringBuildersMethod();

        System.out.println(n.RevName("Mehmet"));

        StringBuildersMethod n2=new StringBuildersMethod();
        System.out.println( n2.StringBuildersMethod("Hasan")
        );


       // StringBuilder s=new StringBuilder();

       // s.append(name);

       // System.out.println(s.append(name).reverse());



    }
}
