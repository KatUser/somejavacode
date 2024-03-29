package shieldtjava;

public class BlockLambaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа 3 = " + factorial.func(3));
        System.out.println("Факториал числа 5 = " + factorial.func(5));
    }
}
