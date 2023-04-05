package se.inner;

public class Dog {
    private String name;
    private Foot foot;

    {
        name = "";
        foot = new Foot();
        System.out.println("Создан экземпляр класса Foot");
    }

    Dog() {}

    Dog(String name) {
        this.name = name;
    }

    void run() {
       /* System.out.println(Foot.this.name); - не сработает */
        System.out.println(foot.name); /**/
        foot.runFoot();
    }

    class Foot{
        private String name = "Пёс";
        void runFoot() {
            System.out.println("Псина " + Dog.this.name + " бежит!");
        }
    }
}
