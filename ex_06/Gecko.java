public class Gecko {
    private String name;
    private int energy = 100; // default value

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Getter for energy
    public int getEnergy() {
        return energy;
    }

    // Setter for energy ensuring it remains between 0 and 100
    public void setEnergy(int energy) {
        if (energy > 100) {
            this.energy = 100;
        } else if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }

    // Hello method from the previous task
    public void hello(String recipient) {
        System.out.println("Hello " + recipient + ", I'm " + name + "!");
    }

    public void hello(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }

    // The eat method
    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "Meat":
                setEnergy(energy + 10);
                System.out.println("Yummy!");
                break;
            case "Vegetable":
                setEnergy(energy - 10);
                System.out.println("Erk!");
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }
}
