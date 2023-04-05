package tasks;

public class Task25 {
    public static void separate(int number) {
        System.out.println(number / 100 + "+"
                + number / 10 % 10 * 10 + "+"
                + number % 10);
    }

    public static void main(String[] args) {
        separate(345);
        int k=3/2;
        System.out.println(k++);
    }

}
/* 345 = 300+40+5 */