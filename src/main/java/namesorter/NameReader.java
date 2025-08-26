package namesorter;

import java.io.*;
import java.util.*;

public class NameReader {
    // Method to read names from a file and return them as a List of strings
    public List<String> readNames(String fileName) throws IOException {

        // Create an ArrayList to store the names
        List<String> names = new ArrayList<>();

        // Use try-with-resources to automatically close resources (BufferedReader and
        // FileReader)
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read each line from the file until there are no more lines
            while ((line = br.readLine()) != null) {

                // Trim any leading or trailing whitespace from the line and add it to the names
                // list
                names.add(line.trim());
            }
        }
        return names;
    }
}
