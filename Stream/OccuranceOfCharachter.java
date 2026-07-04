package Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfCharachter {
    public static void main(String[] args){

        String s="java dev";
        String s1=s.replace(" ","");
        Map< Character,Long> result1=s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<Character,Long>(),Collectors.counting()));      
        Map<Character,Long> result=s1.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<Character,Long>(),Collectors.counting()));

        result.forEach((i,j)->System.out.println(i+":"+j));
    }
    
}
