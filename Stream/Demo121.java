package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Demo121 {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(10,23,234,24,356,56,464,647);
       /*  Stream <Integer> s1=l.stream();
        Stream <Integer>s2=s1.filter(i->i%2==0);
        Stream <Integer> s3=s2.map(i->i*i);
         s3.forEach(i->System.out.println(i));   
        }
                    */
                                          long count=l.stream().filter(i->i%2==0).map(i->i*i).count();
                                      //.forEach(i->System.out.println(i));
                                               System.out.println(count);

        
    }

   

}
