package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class FileStreamer {
    public static void streamFile() throws IOException {
        Files.lines(Path.of("src/main/java/org/example/students.csv"))
                .skip(1)
                .map(Student::createStudentFromCSVLine)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(System.out::println);
    }
}
