package Stream;

import java.util.Arrays;
import java.util.List;

public class EvenCube {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(12,3,34,345,356,567,567,6785);
      //  l1.stream().filter(i->i%2==0).map(i->i*i*i).forEach(i->System.out.println(i));
                List<Integer>l2=l1.stream().filter(i->i%2==0).map(i->i*i*i).toList();
                System.out.println(l2);
        
        
    }
    
}
