package multithreading;

public class Main {
    public static void main(String[] args) {
    //    Timer timer = new Timer();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    System.out.println(1);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 10_000_000; i++) {
            System.out.println(2);
        }
    }
}
