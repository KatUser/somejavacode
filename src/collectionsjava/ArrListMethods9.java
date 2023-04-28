package collectionsjava;

import java.util.ArrayList;
import java.util.List;

public class ArrListMethods9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
        list2.add("Vasya"); /* UnsupportedOperationException; нельзя модифицировать, не могут содержать null */


    }
}
