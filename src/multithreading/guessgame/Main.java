package multithreading.guessgame;

import java.util.Random;

public class Main {
    static boolean winner = false;

    public static void main(String[] args) {
        int bound = 1_000_000_000;
        Random random = new Random();
        int number = random.nextInt(bound);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = new Random().nextInt(bound);
                }
                while (option != number);
                winner = true;
                System.out.println("Winner : " + option);

            }
        });
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < bound; j++) {
                    if (winner) {
                        break;
                    }
                    System.out.println(j + " second. Not guessed this time!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {
                    }
                }
            }
        });
        thread1.start();
    }
}
