package al.access_modifiers.poly;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}
