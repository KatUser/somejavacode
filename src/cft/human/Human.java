package cft.human;

public class Human {
    public void printString() {
        System.out.println("Привет из Human");
    }
}

class Student extends Human {
    @Override
    public void printString() {
        System.out.println("Привет из Student");
    }
}


class HumanTest {

    public static void showInfo(Human human) {
        human.printString();
    }
    public static void main(String[] args) {
        Human human = new Human();
        Student student = new Student();
        showInfo(human);
        showInfo(student);

    }
}
