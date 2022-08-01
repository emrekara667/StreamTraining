package app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCodeGeeks {
    public static void main(String[] args) {


        Stream<String> stringStream = Stream.of("Welcome", "To", "java", "blog");

        Stream<String> mappedStream = stringStream.map(temp -> {
            if (temp.equalsIgnoreCase("JAva"))
                return "Java-W3schools";
            return temp;
        });

        mappedStream.forEach(temp -> System.out.println(temp));

        List<String> stringList = mappedStream.collect(Collectors.toList());
        System.out.println(stringList);


    }
}
