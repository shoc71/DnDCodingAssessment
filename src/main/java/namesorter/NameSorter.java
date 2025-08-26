package DnDCodingAssessment.src.main.java.namesorter;

import java.util.*;

public class NameSorter {
    public List<String> sortByLastName(List<String> names) {
        names.sort(Comparator.comparing(NameSorter::getLastName));
        return names;
    }

    private static String getLastName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        return parts[parts.length - 1];
    }
}
