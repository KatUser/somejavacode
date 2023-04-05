package al.access_modifiers.incaps;

public class Person {
    private String name;
    private int age;

    public void setName (String userName) {
        if (userName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = userName;

    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            throw new IllegalArgumentException();
        }
        this.age = userAge;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
