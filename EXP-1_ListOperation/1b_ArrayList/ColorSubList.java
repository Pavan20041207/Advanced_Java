/*
Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList() 
*/

package adj;

import java.util.ArrayList;
import java.util.List;

public class ColorSubList {

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

        // Extracting the 1st and 2nd elements using subList()
        // Remember: index is 0-based, so 1st and 2nd elements are indices 0 and 1
        if (colors.size() >= 2) {
            List<String> subColors = colors.subList(0, 2);
            System.out.println("Extracted 1st and 2nd elements: " + subColors);
        } else {
            System.out.println("The list doesn't contain enough elements to extract 1st and 2nd.");
        }
    }
}

