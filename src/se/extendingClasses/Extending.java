package se.extendingClasses;

public class Extending {
    public static void main(String[] args) {
        /* Line line1 = new Line();
        line1.width = 1;
        line1.x1 = 5;
        Properties p = (Properties) line1;
      //  Properties p = line1;
        p.color = 111;
        p.width = 65;
        System.out.println(line1.width); */
      /*  Properties geom[] = new Properties[4];
        geom[0] = new Line();
        geom[1] = new Triangle();
        geom[2] = new Rectangle();
        geom[3] = new Ellipse(); */
        Line line1 = new Line();
        line1.showId();

        Object ob1 = new Line();
        Object ob2 = new Triangle();
        Object ob3 = new Properties();

        Line line2 = (Line) ob1; /* Downcasting */

        Line line3 = null;
        if (ob2 instanceof Line){
            line3 = (Line) ob2;
        }

    }
}


class Properties {
    int width, color;
    int id = 1;

    Properties() {
        System.out.println("Конструктор Properties без параметров");
    }

    Properties(int width, int color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор Properties(c width, color) был вызван.");
    }

    void showId() {
        System.out.println("super.id = " + id);
    }
}

class Line extends Properties {
    double x1, y1;
    double x2, y2;

    int id = 2;

    Line() {
        super(1, 1);
        System.out.println("Конструктор Lines был вызван.");
    }

    void showId() {
        super.showId();
        System.out.println("id Line = " + id + " , super.id = " + super.id);
    }
}

class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;
}

class Rectangle extends Properties {
    double x1, y1;
    double x2, y2;
}

class Ellipse extends Properties {
    double x1, y1;
    double x2, y2;
}