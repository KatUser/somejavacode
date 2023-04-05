package al;

public class Human {

    private String name;

    private int age;

    public static String description;  //=""

    private static int countPeople; // = 0;

    public Human(String name, int age) {
        System.out.println("Привет из конструктора 1");
        this.name = "Default";
        this.age = 99;
        countPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(this.name + ", " + this.age + ", " + description);
    }

    public static void getDescripton() {
        System.out.println(description);
    }

    public static void printAllNames() {
        System.out.println(description);
    }

    public void printNumberOfPeople() {
        System.out.println(countPeople);
    }
}
