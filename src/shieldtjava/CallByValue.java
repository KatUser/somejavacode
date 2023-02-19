package shieldtjava;

public class CallByValue {
    public static void main(String[] args) {
        TestClass ob = new TestClass();
        int a = 15;
        int b = 20;

        System.out.println("a & b before call: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a & b after call: " + a + " " + b);
    }
}
