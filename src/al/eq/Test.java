package al.eq;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));

        String st1 = "Hello";
        String st2 = "Hello";
        System.out.println(st2.equals(st1));

        String st3 = new String("Hi");
        String st4 = new String("Hi");
        System.out.println(st4 == st3);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}