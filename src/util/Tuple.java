package util;

import net.mindview.util.TwoTuple;

public class Tuple {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b){
        return new TwoTuple<A,B> (a, b);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
