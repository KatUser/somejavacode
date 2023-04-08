package se.interf;

public interface MathGeom {
    default double getSquare() {
        return 7;
    }  /*since jdk 8, Где НЕ переопределён - будет использоваться реализация по умолчанию */
}
