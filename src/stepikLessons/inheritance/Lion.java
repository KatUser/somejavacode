package stepikLessons.inheritance;

import zt.lesson8.First;

public class Lion extends Feline {
    public Lion() {
        super(4, 2, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("humans");
    }

}
