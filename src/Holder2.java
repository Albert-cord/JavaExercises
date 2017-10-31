//Holder1.java
//

/*public class Holder1 {
    private Automobile a;
    public Holder1 (Automobile a) {
        this.a = a;
    }
    public Automobile get() {
        return a;
    }
}*/

//Holder2.java

public class Holder2 {
 
    private Object o;
    public Holder2(Object o) {
        this.o = o;
    }
    public void set(Object o) {
        this.o = o;
    }
    public Object get() {
        return o;
    }
    public Object toString() {
        return o;
    }
    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();
        System.out.println(h2 +" " + a);
        h2.set("Not a Automobile");
        String s = (String) h2.get();
        System.out.println(h2 +" " + s);
        h2.set(1);
        Integer i = (Integer)h2.get();
        System.out.println(h2 +" " + i);
    }
}
/*public class Holder3<T> {
    private T t;
    public Holder3(T t) {
        this.t = t;
    }
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args) {
        Holder3 <Automobile> h3 =  new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();
        h3.set("String");
        
    }
}*/
//TwoTuple.java
public class TwoTuple<A, B>{
    public final A first;
    public final B second;
    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
        
    }
    public String toString() {
        return " " + first + second ;
    }
}