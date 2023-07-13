package stepikLessons.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
//        Set<Animal> animals = new HashSet<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        animals.forEach(Animal::eat);
//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        ((Dog) animal).run();
        List<AbleToRun> animalsThatCanRun = new ArrayList<>();
        animalsThatCanRun.add(cat);
        animalsThatCanRun.add(dog);
        animalsThatCanRun.add(bird);
        animalsThatCanRun.forEach(AbleToRun::run);

        AbleToFly ableToFly = new Bird();
        bird.fly();
        AbleToRun ableToRun = new Dog();
        Dog dog1 = (Dog) ableToRun;
        dog1.run();
        dog1.eat();
    }
}
