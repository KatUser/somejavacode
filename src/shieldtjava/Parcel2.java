package shieldtjava;

public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    public Contents contents() {
        return new Contents();
    }
    class Destination {
        private String label;
        Destination (String  whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }
    public Destination to (String s) {
        return new Destination(s);
    }
    public void ship (String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Asia");
        Parcel2 q = new Parcel2();
        /* Определение ссылок на  внутренние классы */
        Parcel2.Contents c = p.contents();
        Parcel2.Destination d = q.to("Zalupa");
    }
}
/* Если   понадобится создать объект внутреннего класса где-либо еще,
кроме как в не статическом методе внешнего класса, нужно будет указать тип этого объекта следующим
образом: ИмяВнешнегоКласса.ИмяВнутреннегоКласса, что и делается в методе main ().*/