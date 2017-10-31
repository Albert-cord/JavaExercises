package initialization;

public class Flower {
    String s;
    Flower() {
        this(6, "hi");
        System.out.println("This is 6 & 'hi'");
    }
    Flower(int i, String s){
        this(6);
        this.s = s;
        //ß@Ñe²»¼Ós²»ˆóåe£¿
        System.out.println("This is 6, defined s");
    }
    Flower(int i){
        this("hi");
        System.out.println("This is 6");
    }
    Flower(String s){
        System.out.println("This is hi");
    }
    void say() {
        System.out.println("This is printed word: " + s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.say();
    }
}

