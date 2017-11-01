

public class CaptureConversion {
    public static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.print(t.getClass().getSimpleName());
    }
    public static void f2(Holder<?> holder) {
        f1(holder);
    }
    public static void main(String[] args) {
        Holder<Integer> raw = new Holder<Integer>(1);
        // f1(raw); // Produces warnings
        f2(raw); // No warnings
    }
}
