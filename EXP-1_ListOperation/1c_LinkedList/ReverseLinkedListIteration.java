/*
Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
/*


package adj;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Tiger");

        // Get a descending iterator (reverse order)
        Iterator<String> reverseIterator = animals.descendingIterator();

        // Iterate through the list in reverse order
        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            String animal = reverseIterator.next();
            System.out.println(animal);
        }
    }
}

