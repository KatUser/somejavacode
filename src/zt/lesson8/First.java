package zt.lesson8;

public class First {
    public static int threeMultiply(int a, int b, int c) {
        return a * b *c;
    }

    public static void firstDivided(int a, int b) {
        System.out.println(a / b);
    }
}

class FirstTest {
    public static void main(String[] args) {
        System.out.println(First.threeMultiply(1, 2, 3));
        First.firstDivided(1,1);
    }
}