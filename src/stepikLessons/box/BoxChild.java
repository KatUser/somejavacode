package stepikLessons.box;

import stepikLessons.box.Box;

public class BoxChild extends Box {

    private double weight;

    public BoxChild(double weight) {
        super();
        this.weight = weight;
    }

    public BoxChild(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxChild(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    BoxChild(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    public BoxChild(Box box, int weight) {
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" " + this.weight);
    }

}
