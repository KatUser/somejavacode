package se.interf;

public class MainTwo {
    public static void main(String[] args) {
        final int N = 3;
        GeomInterface geoms[] = new GeomInterface[N];
        geoms[0] = new Line();
        geoms[1] = new Rectangle();
        geoms[2] = new Ellipse();

        for (GeomInterface geom : geoms) {
            if (geom instanceof MathGeom) {
                double s = ((MathGeom) geom).getSquare();
                System.out.println(s);
                System.out.println();
            }
        }

        for (int i = 0; i < N; i++ ) {
            double coords[] = geoms[i].getCoords();
            for (int j = 0;  j < coords.length; j++)
            System.out.println(coords[j] + " ");
            System.out.println();
        }

    }
}

abstract class Geom {
    int width;
    int color;
    abstract void draw();
}

class Line extends Geom implements GeomInterface {
    int y, x;

    public void draw() {
        System.out.println("Line drawing");
    }

    public double[] getCoords() {
        return new double[] {1, 2, 3, 4};
    }
}

class Rectangle extends Geom implements MathGeom, GeomInterface {
    int y, x;

    public void draw() {
        System.out.println("Rectangle draw");
    }

    public double getSquare() { /* public  - обязательно! */
        return 5 * 10;
    }

    public double[] getCoords() {
        return new double[] {2, 2, 2};
    }
}
class Ellipse extends Geom implements MathGeom, GeomInterface {

    int x, y;

    public void draw() {
        System.out.println("Ellipse drawing");
    }

    public double getSquare() { /* public  - обязательно! */
        return 0.5 * 10 * 5;
    }


    public double[] getCoords() {
        return new double[] {0, 0, 0, 0};
    }
}

