package Stream;
import java.util.Arrays;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[]a={1,1,2,2,3,3,4,4,5};
        int[] array=Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(array));
        
    }
    
}
