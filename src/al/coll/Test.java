package al.coll;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); /* Только ссылочные типы в <> */ /*ссылка на интерфейс по java convention*/
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        for (Integer i : list) {
            System.out.println(i);
        }

        /* System.out.println(arrayList); у arrayList реализван метод toString
        System.out.println(arrayList.get(55));
        System.out.println(arrayList.size()); */
    }
}
