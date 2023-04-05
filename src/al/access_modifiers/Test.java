package al.access_modifiers;

import al.access_modifiers.pack1.Person2;

public class Test {
    public int id;

    private int id2;

    public static void main(String[] args) {
        /* public, private, default - can be access in one package, protected */
        Person2 person1 = new Person2();
        person1.name = "Rob";
        System.out.println(Person2.CONSTANT_TEST);
    }

    private void techMethod() {

    }
}
