public class Gecko {
    public String name;

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }
}
