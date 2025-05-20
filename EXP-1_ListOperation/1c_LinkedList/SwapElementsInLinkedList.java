/*
Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))
*/


package adj;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElementsInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // Display list before swapping
        System.out.println("Before swapping:");
        System.out.println(names);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(names, 0, 2);

        // Display list after swapping
        System.out.println("After swapping first and third elements:");
        System.out.println(names);
    }
}
