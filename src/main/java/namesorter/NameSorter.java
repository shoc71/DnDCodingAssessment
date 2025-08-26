package namesorter;

// Necessary Imports
import java.text.*;
import java.util.*;

public class NameSorter {

    // Sort by last name, considering multi-part names, accents, and locale
    public List<String> sortByLastName(List<String> names) {
        // Trim each name before sorting, and use Collator to handle international
        // characters
        names.replaceAll(String::trim); // Trim each name individually

        // Sort by the last name and then by the number at the end (if present)
        names.sort(Comparator.comparing(NameSorter::getLastName, Collator.getInstance())
                .thenComparing(NameSorter::getNumber));

        return names;
    }

    private static String getLastName(String fullName) {
        // Trim any leading/trailing spaces
        fullName = fullName.trim();

        // Split by spaces to get the name parts
        String[] parts = fullName.trim().split("\\s+");

        // Handle edge cases where there is no last name (e.g., empty string or single
        // name)
        if (parts.length == 1) {
            return parts[0]; // Return the single name as the "last name"
        }

        // Return the last part of the name as the last name
        return parts[parts.length - 1];
    }

    // Extract the number at the end of the name (if any)
    private static Integer getNumber(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        String lastPart = parts[parts.length - 1];

        // If the last part is a number, return it; otherwise, return a large value to
        // put at the end
        try {
            return Integer.parseInt(lastPart);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE; // If no number, we set it as a high value so it doesn't affect sorting
        }
    }
}
