package shieldtjava;

public class LA {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение : " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение :  " + myNum.getValue());
        System.out.println("Ещё одно случайное значение : " + myNum.getValue());
    }
}