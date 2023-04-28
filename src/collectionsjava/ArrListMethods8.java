package collectionsjava;
import java.util.List;

public class ArrListMethods8 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 8, 13); /* Нельзя изменить */
        System.out.println(list1);
        list1.add(100); /* UnsupportedOperationException, ImmutableCollections.java:147) нельзя модифицировать, не могут содержать null */
    }
}
