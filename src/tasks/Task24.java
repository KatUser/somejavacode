package tasks;

public class Task24 {
    public static void separate(int number) {
        System.out.println(number / 10 * 10 + "+" + number % 10 );
    }

    public static void main(String[] args) {
        separate(19);
    }
}
/* "10+9\n" */