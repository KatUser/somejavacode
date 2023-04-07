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

        Line line1 = new Line();
        line1.setCoord(1, 1, 1, 1);

    }
}

abstract class Geom {
    int width;
    int color;
    abstract void draw();
}

class Line extends Geom implements GeomInterface {
    private int x1, y1, x2, y2;

    public void draw() {
        System.out.println("Line drawing");
    }

    private boolean isCheck(int x) {
        return (MIN_COORD <= x && x <= MAX_COORD);
    }

    public double[] getCoords() {
        return new double[] {1, 2, 3, 4};
    }

    void setCoord(int x1, int y1, int x2, int y2) {
        if(isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(x2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
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

