package DnDCodingAssessment.src.main.java.namesorter;

import java.io.*;
import java.util.*;

public class NameReader {
    public List<String> readNames(String fileName) throws IOException {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line.trim());
            }
        }
        return names;
    }
}
