package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        // Your original string
        String s = "java is very very easy java";

        // Your split
        String[] split = s.split(" ");

        // Your Arrays.asList
        List<String> asList = Arrays.asList(split);

        // Your stream + collect
        Map<String, Long> collect = asList.stream()
                .collect(
                        Collectors.groupingBy(
                                i -> i, () -> new LinkedHashMap<String, Long>(),
                                Collectors.counting()));

        // Your forEach print
        collect.forEach((a, b) -> System.out.println(a + " = " + b));
    }
}