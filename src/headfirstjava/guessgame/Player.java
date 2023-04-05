package headfirstjava.guessgame;

public class Player {
    int number = 0; /* Здесь хранится вариант число */

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I assume the number is " + number);
    }
}
