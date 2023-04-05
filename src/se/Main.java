package se;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(); /* Point - pt Хранит адрес объекта, на который ссылается */
        Point pt2 = new Point();
        out.println(Point.getCounter());
    }
}

class Point {
    private static final int MAX_COORD = 10;
    int x, y;
    int color;

    static int cnt;

    static {
        cnt = 0;
    }

    Point(int x, int y) {
        /* this(); убирается после создания инициализатора /* = вызов первого конструктора Point() */
        this.x = x; /* this - ссылка на текущий экземпляр объекта */
        this.y = y;
    }

    Point() {cnt ++; }

    public static int getCounter() { /* работают с др стат методами и перемемен и с перем, кторые сооздаются внутрних */
        return cnt;
    }
}
