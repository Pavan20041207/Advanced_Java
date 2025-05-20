/*
Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
*/


package adj;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Create a LinkedList and add some initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Insert "Pink" at the end of the LinkedList
        colors.offerLast("Pink");

        // Display the updated list
        System.out.println("LinkedList after inserting at the end:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

