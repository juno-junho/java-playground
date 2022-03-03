package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
    public static void main(String[] args) {
        Path path = Paths.get("Stream/JavaTest.java");

        try {
            Stream<String> stringStream =  Files.lines(path);
            stringStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
