package stepikLessons;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;


    String getInfo() {
        return this.name
                + " " + this.breed
                + " " + this.weight;
    }

    void run() {
        for (int i = 1; i <= this.speed; i++) {
            System.out.println("I am running at speed : " + this.speed);
        }
    }
}
