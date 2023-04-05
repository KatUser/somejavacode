package interfaces;

public class TestClass {
    public static void main(String[] args) {
        /* Animal animal1 = new Animal(1);
        Person person1 = new Person("tom");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo(); */

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outPutInfo(info1);
        outPutInfo(info2);

        Animal animal = new Animal(3);
        Person person = new Person("Bill");

        outPutInfo(animal);
        outPutInfo(person);

        animal.sleep();
        person.sleep();

        Sleep sleep1 = new Animal(4);
        Sleep sleep2 = new Person("Moira");
        sleep1.sleep();
        sleep2.sleep();

        outSleep(person);
        outSleep(animal);
    }
    public static void outPutInfo(Info info) {
        info.showInfo();
    }

    public static void outSleep(Sleep sleep) {
        sleep.sleep();
    }
}
