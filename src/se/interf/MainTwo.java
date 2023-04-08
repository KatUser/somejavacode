package se.interf;

public class MainTwo {
    public static void main(String[] args) {
        final int N = 3;
        Geom geoms[] = new Geom [N];
        geoms[0] = new Line();
        geoms[1] = new Rectangle();
        geoms[2] = new Ellipse();

        MathGeom mg = null;
        for (int i = 0; i < N; i++) {
            mg = (MathGeom) geoms[i];
            System.out.println(mg.getSquare());
        }
        /*
        for (int i = 0; i < N; i++ ) {
            double coords[] = geoms[i].getCoords();
            for (int j = 0;  j < coords.length; j++)
            System.out.println(coords[j] + " ");
            System.out.println();
        } */

        Line line1 = new Line();

        GeomInterface.showInterval();
        line1.draw();

    }
}

abstract class Geom implements MathGeom { /*в АК не обязат реализовывать методы И */
    int width;
    int color;
    abstract void draw();
}

class Line extends Geom {
    private int x1, y1, x2, y2;

    public void draw() {
        System.out.println("Line drawing");
        GeomInterface.showInterval();
    }

    /*private boolean isCheck(int x) {
        return (MIN_COORD <= x && x <= MAX_COORD);
    }*/

    public double[] getCoords() {
        return new double[] {1, 2, 3, 4};
    }

   /* void setCoord(int x1, int y1, int x2, int y2) {
        if(isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(x2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }*/
}

class Rectangle extends Geom implements MathGeom, GeomInterface {
    int y, x;

    public void draw() {
        System.out.println("Rectangle draw");
    }

    public double getSquare() { /* public  - обязательно! */
        return GeomInterface.super.getSquare();
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

class InterfaceGroup {
    private interface InnerInterface1 { /*private, public, default */
        void method1();

        private void privateMethod() { /* since JDK 9, must be implemented */
            System.out.println("private method");
        }
    }
    interface InnerInterface2 extends InnerInterface1 {
        void method2(); /*приватный метод не наследуется */
    }
}

class UseInterface implements InterfaceGroup.InnerInterface2 {
    public void method1() {}
    public void method2() {}
}