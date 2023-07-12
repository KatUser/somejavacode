package stepikLessons.box;

public class Main {
    public static void main(String[] args) {
        BoxChild boxChild = new BoxChild(5);
        boxChild.showInfo();

        BoxChild boxChild1 = new BoxChild(1, 5);
        boxChild1.showInfo();

        Box box =  new Box(0);
        BoxChild boxChild2 = new BoxChild(box, 90);
        boxChild2.showInfo();
    }
}
