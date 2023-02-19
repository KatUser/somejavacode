package shieldtjava;

public class TestClass {
    int a, b;

    TestClass(int i, int j) {
        this.a = i;
        this.b = j;
    }

    TestClass() {

    }

    public boolean equalTo(TestClass o) {
        return o.a == a && o.b == b;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(TestClass o) {
        o.a *= 2;
        o.b /= 2;
    }
}
