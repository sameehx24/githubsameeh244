package Stream;

import java.util.function.Predicate;

public class MethodReference {
    public static boolean isEven(int i){
        return i%2==0;

    }
    public int sq(int i){
        return i*i;
    }
    public static void main(String[] args) {
        Predicate <Integer>p =i->i%2==0;
        System.out.println(p.test(5));

        Predicate <Integer> pp=MethodReference::isEven;
        System.out.println(pp.test(90));
    }
    
}
