import java.util.Iterator;

public class FibonacciProxy implements Iterable<Integer>{
    private int count = 0;
    public FibonacciProxy(int i) {
        count = i;
    }
    public FibonacciProxy() {
        
    }
    Fibonacci fi = new Fibonacci();
    public Integer next() {
        //fi.setCount(((Fibonacci) fi).getCount() - 1);
        return fi.next();
    }
    public Iterator<Integer> iterator(){
       
        return new Iterator<Integer>() {
            
            public boolean hasNext(){
                return count > 0;
            }
            public Integer next() {
                count --;
                return FibonacciProxy.this.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
          };
         }
    public static void main(String[] args) {
        try{
            for(int i: new FibonacciProxy(5)) 
            System.out.println(i);
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
