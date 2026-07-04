package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount1 {
    public static void main(String[] args) {
        String s1="Java is very very easy Java";
        String []s2=s1.split(" ");
        List<String> asList=Arrays.asList(s2);
       Map<String,Long> result=asList.stream().collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<String, Long>(),Collectors.counting()));
       result.forEach((a,b)->System.out.println(a+":"+b));
    }
    
}
