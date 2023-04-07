package se.abst;

public class MainTwo {
    public static void main(String[] args) {
        final int N = 3;
        Geom geoms[] = new Geom[N];
        geoms[0] = new Line();
        geoms[1] = new Rectangle();
        geoms[2] = new Ellipse();

        for (Geom geom : geoms) {
            geom.draw();
        }

    }
}

abstract class Geom {
    int width;
    int color;
    abstract void draw();
}

class Line extends Geom {
    int y, x;

    public void draw() {
        System.out.println("Line drawing");
    }
}
class Rectangle extends Geom {
    int y, x;

    public void draw() {
        System.out.println("Rectangle draw");
    }
}
class Ellipse extends Geom {

    int x, y;

    public void draw() {
        System.out.println("Ellipse drawing");
    }
}

