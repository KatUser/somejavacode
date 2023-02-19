package shieldtjava;

public class OverLoadDemo {
    void test() {
        System.out.println("No params");
    }
/**
    void test(int a) {
        System.out.println("Param integer: " + a);
    }
 **/

    void test(int a, int b) {
        System.out.println("Params integers: " + a + ", " + b);
    }

     void test(double a) {
         System.out.println("Param double: " + a);
         System.out.println("Внутреннее преобразование при вызове "
            + " test(double) a: " + a);
     }

     void test(String a) {
         System.out.println("Param string: " + a);
     }
}
