package al.access_modifiers.poly;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); /* собака как животное */
        Dog dog1 = new Dog(); /* псина как псина */

        animal1.eat(); /* Будет вызваться метод из потомка */
        /* animal.bark(); - cannot */

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
