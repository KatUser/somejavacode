package javabooks;

public class DemoBox4 {
    public static void main(String[] args) {
        Box mybox1 = new Box(1, 1, 1);
        Box mybox2 = new Box(1, 1, 1);
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 1;
        mybox2.height = 1;
        mybox2.depth = 1;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);

    }
}
