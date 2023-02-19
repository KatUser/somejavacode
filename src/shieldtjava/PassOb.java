package shieldtjava;

public class PassOb {
    public static void main(String[] args) {
        TestClass ob1 = new TestClass(100, 22);
        TestClass ob2 = new TestClass(100, 22);
        TestClass ob3 = new TestClass(-1, -1);

        System.out.println("ob1 == ob2 : " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 : " + ob1.equalTo(ob3));
    }
}
