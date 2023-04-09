package wr;

public class Mi8 extends Helicopter implements VerticalTakeOff {

    @Override
    public void fly() {
        System.out.println("Mi8 is flying");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Mi8 is flying vertically");
    }
}
