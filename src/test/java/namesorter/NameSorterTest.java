package namesorter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameSorterTest {

    // Normal Tests
    @Test
    public void testSortByLastName() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Mary Jane Watson",
                "Boa Horse Jackson",
                "Unos Logic",
                "Adam Smith");

        List<String> expected = Arrays.asList(
                "Boa Horse Jackson",
                "Unos Logic",
                "Adam Smith",
                "Mary Jane Watson");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test with numbers
    @Test
    public void testSortByLastNameWithNumbers() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Mary Jane Watson 2",
                "Boa Horse Jackson 4",
                "Unos Logic 1",
                "Adam Smith 7");

        List<String> expected = Arrays.asList(
                "Unos Logic 1",
                "Mary Jane Watson 2",
                "Boa Horse Jackson 4",
                "Adam Smith 7");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for hyphens and apostrophes
    @Test
    public void testSortByLastNameWithSpecialCharacters() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Mary-Jane Watson",
                "Boa Horse-Jackson",
                "O'Conner Smith",
                "Adam Smith");

        List<String> expected = Arrays.asList(
                "Boa Horse-Jackson",
                "O'Conner Smith",
                "Adam Smith",
                "Mary-Jane Watson");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for spaces at the start or end
    @Test
    public void testSortByLastNameWithLeadingTrailingSpaces() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "   Mary Jane Watson   ",
                " Boa Horse Jackson ",
                "  Unos Logic  ",
                "   Adam Smith");

        List<String> expected = Arrays.asList(
                "Boa Horse Jackson",
                "Unos Logic",
                "Adam Smith",
                "Mary Jane Watson");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for French names
    @Test
    public void testSortByLastNameWithFrenchCharacters() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Marie-Claire Dupont",
                "Jean-Paul Sartre",
                "René Descartes",
                "Émilie Du Châtelet");

        List<String> expected = Arrays.asList(
                "Émilie Du Châtelet",
                "René Descartes",
                "Marie-Claire Dupont",
                "Jean-Paul Sartre");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for single names
    @Test
    public void testSortByLastNameWithSingleWordNames() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Madonna",
                "Beyoncé",
                "Cher",
                "Prince");

        List<String> expected = Arrays.asList(
                "Beyoncé",
                "Cher",
                "Madonna",
                "Prince");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for names with mixed case (upper/lower)
    @Test
    public void testSortByLastNameWithMixedCase() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Mary jane watson",
                "BOA HORSE jackson",
                "UNOS logic",
                "Adam SMITH");

        List<String> expected = Arrays.asList(
                "BOA HORSE jackson",
                "UNOS logic",
                "Adam SMITH",
                "Mary jane watson");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

    // Test for names with non-English characters
    @Test
    public void testSortByLastNameWithNonEnglishCharacters() {
        NameSorter sorter = new NameSorter();

        List<String> unsorted = Arrays.asList(
                "Jürgen Müller",
                "Mário Silva",
                "Frédéric Chopin",
                "José María");

        List<String> expected = Arrays.asList(
                "Frédéric Chopin",
                "José María",
                "Jürgen Müller",
                "Mário Silva");

        List<String> actual = sorter.sortByLastName(unsorted);
        assertEquals(expected, actual);
    }

}
