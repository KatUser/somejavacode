package shieldtjava;
/*1. ( 1) Напишите класс с именем 0uter, содержащий внутренний класс с именем lnner.
Добавьте в 0uter метод, возвращающий объект типа Inner. В методе main() создайте
и инициализируйте ссылку на lnner.*/
public class Outer3 {
    private int i = 10;
    private int outerIMethod() {
        return i;
    }
    class Inner3 {
        private String str;
        private int methodInner() {
            return i;
        }
    }

    public Inner3 makeInner3() {
        return new Inner3();
    }
}

class Outer3Test {
    public static void main(String[] args) {
        Outer3 o3 = new Outer3();
        Outer3.Inner3 inner3 = o3.makeInner3();
    }
}