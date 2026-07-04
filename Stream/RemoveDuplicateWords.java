package Stream;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String s="java is very very easy java";
        String [] result=s.split(" ");
        List<String> aslist=Arrays.asList(result);
        aslist.stream().distinct().forEach(i->System.out.print(i+" "));
    }  
}
