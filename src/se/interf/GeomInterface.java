package se.interf;

public interface GeomInterface { /*since jdk 8 - static methods are allowed in interfaces*/
    int MIN_COORD = 0; /* = public static final */

    int MAX_COORD = 1000;

    double [] getCoords();

    static void showInterval() { /*статич метод д. иметь реализацию и не м.б. переопределен в дочерних классах*/
        System.out.println(MAX_COORD + " and " + MIN_COORD); /* Вызывается из интерфейса*/
    }

    default double getSquare() {
        return -5;
    }
}
