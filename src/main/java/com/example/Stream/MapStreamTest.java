package Stream;

import java.io.File;
import java.util.stream.Stream;

public class MapStreamTest {
    public static void main(String[] args) {
        File[] fileArr = {new File("Stream/FileStream.java"),
                new File("Stream/JavaTest.java"),
                new File("Stream/JavaTest.java"),
                new File("Stream/FileStream.md"),
                new File("Stream/InterateStream.java"),
                new File("Stream/RandomStream.java")
        };

        Stream<File> fileStream = Stream.of(fileArr);
        //map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)  //확장자 없는 것 제외
                .peek(s -> System.out.printf("filename=%s%n",s))    //중간에 확인할수 있음. debugging 용도
                .map(s -> s.substring(s.indexOf('.') + 1))  //확장자만 추출
                .peek(s -> System.out.printf("extension=%s%n",s))
                .map(String::toUpperCase)   //대문자로변환
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }
}
