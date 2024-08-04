public class StringCounts {


    private String name;
    private String lastName;
    private int ssn;

    public String getName() {
        return name;
    }



    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }


    public static void main(String[] args) {

        StringCounts n=new StringCounts();

      n.setLastName("Ozdemir");
      n.setName("Burak");
      n.setSsn(123);


        System.out.println(n.getSsn());
        System.out.println(n.getName());
        System.out.println(n.getLastName());

        System.out.println("This is my information::"+ "My name is ::"+ n.getName() +" "+n.getLastName()+ " My SSN number is::"+n.getSsn() );

    }
}
