package shieldtjava;

public class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner2 {
                void display() {
                    System.out.println(" Вывод из внутреннего класса переменной " +
                            "внешнего класса " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}

class InnerClassTest2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test();
    }
}

