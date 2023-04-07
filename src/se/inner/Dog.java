package se.inner;

public class Dog {
    private String name = "";
    private Foot foot = new Foot();

    private int dogId = -1;

    {
        name = "";
        Statistics.counter ++;
        dogId = ++ Statistics.id;
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

    class Foot{ /* private - будет доступен только из Dog */
        private String name = "Пёс";
        void runFoot() {
            System.out.println("Псина " + Dog.this.name + " бежит!");
        }
    }

    static class Statistics {
        public static int counter = 0;
        public static int id = 0;
    }
}
