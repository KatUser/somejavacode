package shieldtjava;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box(1, 1, 1);
        Box mybox2 = new Box(1, 1, 1);

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());

    }
}
