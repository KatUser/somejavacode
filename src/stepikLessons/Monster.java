package stepikLessons;

public class Monster {
    int eye;
    int hand;
    int leg;

    Monster() {
        this(2);
    };

    Monster(int amount) {
        this(amount, amount, amount);
    }

    Monster(int eye, int hand, int leg) {
        this.eye = eye;
        this.hand = hand;
        this.leg = leg;
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(1, "Grrr!!!");
    }

    void voice(int count, String sound) {
        for (int i = 0; i < count; i++) {
            System.out.println(sound);
        }
    }
}
