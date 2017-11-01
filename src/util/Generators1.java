package util;
import java.util.*;
import generics.coffee.*;
import net.mindview.util.Generator;
import story.*;
import util.Product.Shelf;
//�Բ� ������Ϊʲô��
//public class Generators1 {
    //����Ŀ�����ӵڶ�������������
    /*public static <T> Collection<T> 
    fill(Collection<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++) 
            coll.add(gen.next());
        return coll;
    }*/
    public class Generators1 {
        @SuppressWarnings("unchecked")
        public static <T> Collection<T>
        fill(Shelf shelf, util.Generator<Product> generator, int n) {
          for(int i = 0; i < n; i++)
            shelf.add(generator.next());
          return (Collection<T>) shelf;
        } 
    public static void main(String[] args) {
        Collection<Star> star = fill(new ArrayList<Star>(), new StoryCharacters(), 4);
        for(Star s: star)
            System.out.println(s);
        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12);
              for(int i : fnumbers)
                System.out.print(i + ", ");
    }
    /*public static <T> Collection<T> fill(util.Product.Shelf shleves, util.Generator<Product> generator, int nProducts) {
        // TODO Auto-generated method stub
        for(int i = 0; i < nProducts; i++) {
            shleves.add(generator.next());
        }
        return null;
    }*/
}
