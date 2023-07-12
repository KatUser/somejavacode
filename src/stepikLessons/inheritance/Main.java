package stepikLessons.inheritance;

public class Main {
    public static void main(String[] args) {
        DomesticCat domesticCat = new DomesticCat();
        Lion lion = new Lion();
//        System.out.println(domesticCat.isCanEatPerson());
//        System.out.println(lion.isCanEatPerson());
//        System.out.println(domesticCat.legs);
        domesticCat.eat();
        lion.eat();
    }
}
