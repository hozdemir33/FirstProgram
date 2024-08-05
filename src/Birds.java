public class Birds {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String color;
    public  int age;

    public Birds(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


}
