/*
Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/

package adj;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Create a ListIterator starting at index 1 (2nd element)
        Iterator<String> iterator = fruits.listIterator(1);

        // Iterate through the list starting from the 2nd position
        System.out.println("Iterating from the 2nd element:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

