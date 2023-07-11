package stepikLessons;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String element) {
        array[size] = element;
        size ++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int  i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public void remove(String name) {
        for (int i = 0; i < size - 1; i++) {
            if (Objects.equals(name, array[i])) {
                remove(i);
                break;
            }
        }

    }

    public int getSize() {
        return size;
    }

    public String getElement(int index) {
        return array[index];
    }
}
