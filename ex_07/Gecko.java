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

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy > 100) {
            this.energy = 100;
        } else if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }

    public void hello(String recipient) {
        System.out.println("Hello " + recipient + ", I'm " + name + "!");
    }

    public void hello(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }

    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                setEnergy(energy + 10);
                System.out.println("Yummy!");
                break;
            case "vegetable":
                setEnergy(energy - 10);
                System.out.println("Erk!");
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public void work() {
        if (energy >= 25) {
            setEnergy(energy - 9);
            System.out.println("I'm working T.T");
        } else {
            setEnergy(energy + 50);
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }
}
