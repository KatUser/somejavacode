package tasks;

public class Task26 {
    public static void transform(int number) {
        System.out.println(number % 10 * 10 + number / 10 + 8);
    }

    public static void main(String[] args) {
        transform(49);
    }
} /* 7 3 + 8 = 81 */