package collectionsjava;

import java.util.ArrayList;

public class ArrListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Zaur");
        arrayList3.add("Kolya");
        arrayList1.retainAll(arrayList3);
        System.out.println(arrayList1);
        System.out.println(arrayList3);

        boolean result = arrayList1.containsAll(arrayList3);
        System.out.println(result);
    }
}
