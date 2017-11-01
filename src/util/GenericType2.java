package util;

public class GenericType2<T extends HasF> implements ReturnGenericType<T> {
    private T t;

    @Override
    public  GenericType2(T x) {
        // TODO Auto-generated method stub
        t = x;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        HasF hf1 = new HasF();
        GenericType gy = new GenericType(hf1);
        gy.f();
        HasF hf2 = new HasF();
        gy.set(hf2);
        gy.f();
        //The method f() is undefined for the type Object
        //gy.get().f();
        
        
        
    }
}
