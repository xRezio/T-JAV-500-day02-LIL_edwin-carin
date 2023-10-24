public class Example {
    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur", 5);
        Gecko benjy = new Gecko();
        Gecko charlie = new Gecko("Charlie", 12);
        Gecko dana = new Gecko("Dana", 15);

        System.out.println(arthur.getName() + " - " + arthur.getAge());
        arthur.status();

        System.out.println(benjy.getName() + " - " + benjy.getAge());
        benjy.status();

        System.out.println(charlie.getName() + " - " + charlie.getAge());
        charlie.status();

        System.out.println(dana.getName() + " - " + dana.getAge());
        dana.status();

        // Test the setAge() method
        benjy.setAge(3);
        System.out.println(benjy.getName() + " after setting age to " + benjy.getAge());
        benjy.status();
    }
}
