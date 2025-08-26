# DnDCodingAssessment

Name Sort based on Last Name

How to Install Maven:

On Windows: [Maven Tutorial - Crash Course](https://www.youtube.com/watch?v=Xatr8AZLOsE)

On Mac/Linux:
` sudo apt install maven -y`

To compile: `mvn compile`

To run the program:

```

mvn exec:java -Dexec.mainClass="namesorter.NameSorterApp" -Dexec.classpathScope=compile -Dexec.classpath=/DnDCodingAssessment/src/main/java/namesorter

```

To run all test cases; `mvn test`
