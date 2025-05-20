/*
Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
*/

package adj;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {

    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original colors list: " + colors);

        // Sorting the list using Collections.sort()
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted colors list: " + colors);
    }
}

