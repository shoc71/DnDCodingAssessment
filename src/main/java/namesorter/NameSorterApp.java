package DnDCodingAssessment.src.main.java.namesorter;

// import java.io.*;
import java.util.*;

public class NameSorterApp {
    public static void main(String[] args) {
        String inputFile = "unsorted-names-list.txt";
        String outputFile = "sorted-names-list.txt";

        try {
            NameReader reader = new NameReader();
            NameSorter sorter = new NameSorter();
            NamePrinter printer = new NamePrinter();
            NameWriter writer = new NameWriter();

            List<String> names = reader.readNames(inputFile);
            List<String> sortedNames = sorter.sortByLastName(names);

            writer.writeNames(outputFile, sortedNames);
            printer.printNames(sortedNames);

            System.out.println("\nSorted names written to: " + outputFile);
        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
    }
}
