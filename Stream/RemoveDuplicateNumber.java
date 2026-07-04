package Stream;

import java.util.Arrays;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
         int [] a={1,2,3,4,5,5,1,23,4,};
    int [] result=Arrays.stream(a).distinct().toArray();

System.out.println(Arrays.toString(result));
    }
        
    }
   

    

