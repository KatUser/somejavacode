package shieldtjava;

public class LA2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) {
            System.out.println("Число 10 четное");
        }
        if (!isEven.test(9)) {
            System.out.println("Число 9 нечетное");
        }
        NumericTest isNotNegative = (n) -> n >= 0;
        if (isNotNegative.test(1)) {
            System.out.println("Число 1 неотрицательное");
        }
        if (!isNotNegative.test(-1)) {
            System.out.println("Число -1 отрицательное");
        }
    }
}
