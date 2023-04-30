package collectionsjava;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class IteratorEx1 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
    }
}
