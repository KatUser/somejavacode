package interfaces;

public class Animal implements Info, Sleep {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Id is: " + this.id);
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps for 5 hrs");
    }
}


