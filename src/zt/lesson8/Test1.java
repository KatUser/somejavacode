package zt.lesson8;

public class Test1 {
    public final int i = 5; /* must be initialized */
}

class Test2{
    public final int a; /* int a can be used with instance of Test2 */
    Test2() {
        a = 10;
    }
    Test2(boolean b) {
        a = 15;
    }
    public void abc(final short s) {
        final byte b; /* local variables have no default value */
        b = 10;
        System.out.println(b + s);
    }
}

class TestTest {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.a);

    }
}