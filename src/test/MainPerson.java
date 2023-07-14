package test;

import stepikLessons.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.setAge(40);
        System.out.println("Name : " + person.getName() + ", Age : " + person.getAge());
    }
}
