/* 
Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements,
4.Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

package adj;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // Initial elements
        List<String> fruitsArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        List<String> fruitsLinkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

        System.out.println("----- ArrayList Operations -----");
        performOperations(fruitsArrayList);

        System.out.println("\n----- LinkedList Operations -----");
        performOperations(fruitsLinkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Grapes");
        System.out.println("After adding Grapes: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Strawberry");
        list.addAll(moreFruits);
        System.out.println("After adding multiple fruits: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(0, "Watermelon");
        System.out.println("After updating index 0 to Watermelon: " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(2); // remove by index
        System.out.println("After removing Banana and element at index 2: " + list);

        // 7. Searching elements
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 8. List size
        System.out.println("Size of list: " + list.size());

        // 9. Iterating over list using for-each
        System.out.print("Iterating with for-each: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 12. Sublist
        if (list.size() >= 3) {
            List<String> subList = list.subList(1, 3);
            System.out.println("Sublist (1 to 3): " + subList);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
