package al;

public class Dog extends Animal {
    String legs = "4";

    @Override
    public void eat() {
        System.out.println("Eating like a dog");
    }
    public void bark() {
        System.out.println("I am barking");
    }

    public void showName() {
        System.out.println(name);
    }

    public void showLegs() {
        System.out.println(legs);
    }
}
