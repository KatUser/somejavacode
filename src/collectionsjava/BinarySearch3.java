package collectionsjava;

import java.util.Arrays;


public class BinarySearch3 {
    public static void main(String[] args) {
        int[] arr = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 150);
        System.out.println(index);
    }
}

