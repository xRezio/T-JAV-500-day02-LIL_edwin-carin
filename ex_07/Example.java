public class Example {
    public static void main(String[] args) {
        Gecko mimi = new Gecko("Mimi");
        
        System.out.println("Energy before work: " + mimi.getEnergy());
        mimi.work();
        System.out.println("Energy after work: " + mimi.getEnergy());

        mimi.setEnergy(20);
        System.out.println("Energy before work: " + mimi.getEnergy());
        mimi.work();
        System.out.println("Energy after work: " + mimi.getEnergy());
    }
}
