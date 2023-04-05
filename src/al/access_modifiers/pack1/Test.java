package al.access_modifiers.pack1;


public class Test {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.surname = "E";
        /* p1.age = 29; - impossible */
        System.out.println(p1.nickname);
    }
}
