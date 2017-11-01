import java.util.*;

import net.mindview.util.Generator;
import story.*;

public class Generators1 {
    @SuppressWarnings("unchecked")
    public static <T, W> Collection<T, W> fill(Collection<T> coll, W gen, int n){
        for(int i = 0; i < n; i++) {
            coll.add((T) gen.next());
        }
        return coll;
    }
    public static void main(String[] args) {
        Collection<Star> star = fill(new ArrayList<Star>(), new StoryCharacters(), 4);
        for(Star s: star)
            System.out.println(s);
    }
}
