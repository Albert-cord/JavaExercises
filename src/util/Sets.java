package util;
import java.util.*;

public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = new hashSet<T>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result = new hashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T> difference(Set<T> a, Set<T> b){
        Set<T> result = new hashSet<T>(a);
        result.removeAll(b);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a, Set<T> b){
        Set<T> result = new hashSet<T>(a);
        return difference(union(a, b), intersection(a, b));
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
