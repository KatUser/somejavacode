package javabooks;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box(1, 1, 1);
        Box mybox2 = new Box(2, 2, 2);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
