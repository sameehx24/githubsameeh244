package Stream;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<String> l=Arrays.asList("Amar","Sameeh","Abhijith","Alldin","hello");
       l.stream().filter(i->i.contains("A")).map(i->i.toUpperCase()).forEach(i->System.out.println(i));

        List<Integer>l1=Arrays.asList(99,88,12,34,56,236,345,567);
        l1.stream().distinct().sorted().forEach(i->System.out.println(i));
     
        List<String> l2=Arrays.asList("Yema","Sunni","yakob","lily","Ram");
        List<String>l3=l2.stream().filter(i->i.contains("y")).map(i->i.toLowerCase()).toList();

        System.out.println(l3);
    }

        
    
}
