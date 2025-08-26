package DnDCodingAssessment.src.main.java.namesorter;

import java.io.*;
import java.util.*;

public class NameWriter {
    public void writeNames(String fileName, List<String> names) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String name : names) {
                writer.write(name + System.lineSeparator());
            }
        }
    }
}
