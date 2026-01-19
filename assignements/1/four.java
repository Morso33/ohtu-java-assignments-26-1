public class four {
    private String name;

    public four(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        four cat1 = new four("Whiskers");
        four cat2 = new four("Rex");

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();

    }
}