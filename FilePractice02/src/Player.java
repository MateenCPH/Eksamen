public class Player {

    private String name;
    private int age;
    private String city;

    public Player(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Fighting out of the red corner, " + age + " years old, lives in " + city + ", and the name is " + name + "!!!!!";
    }
}
