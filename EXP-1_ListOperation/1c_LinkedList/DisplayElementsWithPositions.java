/*
Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )
*/

package adj;

import java.util.LinkedList;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        // Display elements along with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Position " + i + ": " + cities.get(i));
        }
    }
}

