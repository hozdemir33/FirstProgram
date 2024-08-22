public class MethodOverloading {


    public int add(int a, int b) {

        return a + b;

    }
// Overloaded method to add three integers

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        MethodOverloading num=new MethodOverloading();

      int newNumber1= num.add(1,2);
        System.out.println(newNumber1);

        int newNumber2=num.add(2,3,4);
        System.out.println(newNumber2);


    }
}
