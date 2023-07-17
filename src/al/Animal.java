package al;

public class Animal {
//
//    String name;
//
//    private String legs;

//    }
//    public void sleep() {
//        System.out.println("I am sleeping");
//    }

    private int id;
    public Animal(){}

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public String toString() {
        return "Animal: " + String.valueOf(id);
    }
}
