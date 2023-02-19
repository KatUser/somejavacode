package shieldtjava;

public class OverLoadTry {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;
        ob.test();
        ob.test(1);
        ob.test(1.0);
        ob.test("1");
        ob.test(1, 1);
        ob.test(i);
        ob.test(123.3);
    }
}
