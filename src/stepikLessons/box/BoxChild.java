package stepikLessons.box;

import stepikLessons.box.Box;

public class BoxChild extends Box {

    private double weight;

    BoxChild(double weight) {
        super();
        this.weight = weight;
    }

    BoxChild(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    BoxChild(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    BoxChild(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" " + this.weight);
    }

}
