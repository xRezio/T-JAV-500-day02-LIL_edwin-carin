public class Gecko {
    // Make the name attribute private
    private String name;

    // Constructor with a name parameter
    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    // Default constructor
    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }
}
