package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DoubleEven {
    public static void main(String[] args){
      /*  List<Integer> l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(60);
        l.add(69);
        l.add(999);
        System.out.println(l.get(6));
 */
        List<Integer>l2=Arrays.asList(10,20,23,30,40,99,999);
        int result=0;
        for(int num:l2){
            if(num%2==0){
                num=num*num;
                result+=num;
            }
        }
        System.out.println(result);
    }   
}
