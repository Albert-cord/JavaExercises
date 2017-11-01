package util;

public class GenericType<T> implements ReturnGenericType<T> {
    private T t;
    public GenericType(T x) {
        t = x;
    }
    public void f() {
        System.out.println(this.getClass().getSimpleName()+ "  f()");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }

    public void set(T a) {
        // TODO Auto-generated method stub
        t = a;
        
    }
    public T get() {
        // TODO Auto-generated method stub
        return t;
        
    }

    

}
