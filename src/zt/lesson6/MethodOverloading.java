package zt.lesson6;

public class MethodOverloading {
    void showVar(int i) {
        System.out.println(i);
    }

    void showVar(int a, int b) {
        System.out.println(a + ", " + b);
    }

    void showVar(boolean j) {
        System.out.println(j);
    }

    void showVar(String s) {
        System.out.println(s);
    }

    void showVar (String s, int c) {
        System.out.println("String :" + s + " int: " + c);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.showVar(5);
        methodOverloading.showVar(false);
        methodOverloading.showVar("String");
        methodOverloading.showVar(1, 0);
    }

}
