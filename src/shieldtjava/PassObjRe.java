package shieldtjava;

public class PassObjRe {
    public static void main(String[] args) {
        TestClass ob = new TestClass(15, 20);

        System.out.println("ob.a & ob.b. before call: "
            + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a & ob.b. before call: "
            + ob.a + " " + ob.b);
    }
}
