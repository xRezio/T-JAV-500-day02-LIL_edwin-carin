public class Gecko {
    private String name;

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name.trim() + "!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public String getName() {
        return name;
    }

    public void hello(String s) {
        System.out.println("Hello " + s.trim() + ", I'm " + name.trim() + "!");
    }

    public void hello(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + name.trim() + "!");
        }
    }
}
