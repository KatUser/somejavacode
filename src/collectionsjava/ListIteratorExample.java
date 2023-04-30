package collectionsjava;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversedIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reversedIterator.hasPrevious()) { /*Endless loop*/
            if (iterator.hasNext() != reversedIterator.hasPrevious()) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
