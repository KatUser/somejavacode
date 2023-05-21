package zt.lesson8;

public class TryStatic {
    static final double pi = 3.14;
    public double squareRound(double r) {
        return pi * Math.pow(r, 2);
    }

    public static double lenghtRound(double r) {
        return pi * 2 * r;
    }

    public void info(double r) {
        System.out.println("Radius: " + r
                + ", Round length: " + TryStatic.lenghtRound(r)
                + ", Square: " + squareRound(r));
    }
}

class TryStaticTest {
    public static void main(String[] args) {
        TryStatic ts = new TryStatic();
        System.out.println(ts.squareRound(1));
        System.out.println(TryStatic.lenghtRound(3));
        ts.info(1);
    }
}
