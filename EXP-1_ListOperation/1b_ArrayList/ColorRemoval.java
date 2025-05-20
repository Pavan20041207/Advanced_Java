/* 
Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList 
*/

package adj;

import java.util.ArrayList;

public class ColorRemoval {

    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original colors list: " + colors);

        // Removing the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedColor = colors.remove(1); // removes "Green"
            System.out.println("Removed the 2nd element: " + removedColor);
        } else {
            System.out.println("List does not have enough elements to remove the 2nd one.");
        }

        // Removing the color "Blue"
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed the color 'Blue' from the list.");
        } else {
            System.out.println("The color 'Blue' was not found in the list.");
        }

        // Display the updated list
        System.out.println("Updated colors list: " + colors);
    }
}
