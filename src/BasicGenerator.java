import util.Generator;

public class BasicGenerator <T> implements Generator<T> {
    private Class type;
    public BasicGenerator(Class c) {
        type = c;
    }
    public T next() {
        try {
            return type.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
