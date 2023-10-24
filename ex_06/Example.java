public class Example {
    public static void main(String[] args) {
        Gecko mimi = new Gecko("Mimi");
        
        // Test getName and hello methods
        System.out.println(mimi.getName());
        mimi.hello("Titi");
        mimi.hello(2);
        
        // Test getEnergy and eat methods
        System.out.println("Energy before eating: " + mimi.getEnergy());
        mimi.eat("Meat");
        System.out.println("Energy after eating meat: " + mimi.getEnergy());
        mimi.eat("Vegetable");
        System.out.println("Energy after eating vegetable: " + mimi.getEnergy());
        mimi.eat("Candy");
        System.out.println("Energy after eating candy: " + mimi.getEnergy());
    }
}
