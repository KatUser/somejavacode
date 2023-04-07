package se.inner;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Жучка"); /*При инициализайии псины создался экз класса Foot , кот. использовали чеерез foot = new Foot();*/
        d.run();
        Dog d2 = new Dog("Полкан");
        d2.run();
        System.out.println(Dog.Statistics.counter);
    }
}
