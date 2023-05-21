package shieldtjava;

public class LA3 {
    public static void main(String[] args) {
        NumericTest2 isDivider = (n, d) -> (n % d) == 0;
        System.out.println(isDivider.test(1,1));
    }
}
