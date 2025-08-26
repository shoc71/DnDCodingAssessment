package DnDCodingAssessment.test.java.namesorter;
// package D&D Coding Assessment.src.test.java.namesorter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameSorterTest {
    
    @Test
    public void testSortByLastName() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Mary Jane Watson",
                "Boa Horse Jackson",
                "Unos Logic",
                "Adam Smith"
        );

        List<String> expected = Arrays.asList(
                "Boa Horse Jackson",
                "Unos Logic",
                "Adam Smith",
                "Mary Jane Watson"
        );

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

}
