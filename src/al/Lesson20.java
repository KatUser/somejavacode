package al;

public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human("name", 23);
        Human h1 = new Human("Bob", 55);
        human.setName("Tom");
        Human.description = "nice";
        human.getAllFields();
        h1.getAllFields();

        /* h1.description = "cool"; - nO! */
        Human.description = "cool";
        human.getAllFields();
        h1.getAllFields();

        human.printNumberOfPeople();
        h1.printNumberOfPeople();

        Math.abs(-1); // static method, pi = static field
    }
}
