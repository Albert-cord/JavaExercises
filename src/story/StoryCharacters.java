package story;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class StoryCharacters implements Generator<Star>, Iterable<Star> {
    private Class[] types = {
            Liudehua.class, Shuqi.class, Zhouxingchi.class,
    };
    private int size = 0;
    private static Random rand = new Random(47);
    
    public StoryCharacters() {
        
    }
    public StoryCharacters(int sz) {
        this.size = sz;
    }
    public Star next() {
        try {
            return (Star)types[rand.nextInt(types.length)].newInstance();
        } 
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        //return null;
    }
    class StoryIterator implements Iterator<Star>{
        int count = size;
        public boolean hasNext() {
            return count > 0;
        }
        public Star next() {
            count--;
            return StoryCharacters.this.next();
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };
    public Iterator<Star> iterator(){
        return new StoryIterator();
    }
    public static void main(String[] args) {
       StoryCharacters ss = new StoryCharacters();
       for(int i = 0; i<3; i++) {
           System.out.println(ss.next());
       }
       //int sz = 4;
       //StoryCharacters ss1 = new StoryCharacters(4);
       for (Star s : new StoryCharacters(4)) {
           System.out.println(s);
       }
    }
    /*@Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }*/
    @Override
    /*public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }*/
}
