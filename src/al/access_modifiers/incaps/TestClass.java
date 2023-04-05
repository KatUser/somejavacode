package al.access_modifiers.incaps;

import al.access_modifiers.pack1.Person2;

public class TestClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("AAaa");
        person.setAge(1);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
