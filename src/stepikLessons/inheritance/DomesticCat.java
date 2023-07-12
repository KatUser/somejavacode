package stepikLessons.inheritance;

public class DomesticCat extends Feline {
    public DomesticCat() {
        super(4, 2, false);
        this.legs = 7;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("home-made food");
    }
}
