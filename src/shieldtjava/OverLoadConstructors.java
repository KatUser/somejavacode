package shieldtjava;

public class OverLoadConstructors {
    public static void main(String[] args) {
        Box mybox1 = new Box(1, 1, 1);
        Box clonemybox1 = new Box(mybox1);
        System.out.println(mybox1.volume());
        System.out.println(clonemybox1.volume());

    }
}
