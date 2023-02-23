package headfirstjava;

public class Wolf extends Canine {
    String food = "meat";

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("I am a wolf");
    }

    @Override
    public String eat(String food) {
        return super.eat(food);
    }

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        System.out.println(wolf.eat(wolf.food));
        System.out.println(wolf.roam());
        System.out.println(wolf.sleep());
    }
}
