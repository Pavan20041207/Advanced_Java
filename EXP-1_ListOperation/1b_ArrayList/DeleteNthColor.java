

package adj;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNthColor {

    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original colors list: " + colors);

        // Get the index (n-th element) to remove from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (1-based index) of the element to remove: ");
        int n = scanner.nextInt();

        // Convert to 0-based index and validate
        int index = n - 1;
        if (index >= 0 && index < colors.size()) {
            String removed = colors.remove(index);
            System.out.println("Removed color: " + removed);
        } else {
            System.out.println("Invalid index! No color removed.");
        }

        // Display the updated list
        System.out.println("Updated colors list: " + colors);
    }
}
