package namesorter;

import java.io.*;
import java.util.*;

public class NameWriter {

    // Method to write the list of names to a file
    public void writeNames(String fileName, List<String> names) throws IOException {

        // Use try-with-resources to ensure the FileWriter is closed automatically
        try (FileWriter writer = new FileWriter(fileName)) {

            for (String name : names) {

                // Write each name to the file followed by a system-specific line separator
                writer.write(name + System.lineSeparator());
            }
        }
    }
}
