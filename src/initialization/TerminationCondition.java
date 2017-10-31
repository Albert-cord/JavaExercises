package initialization;
class Book{
    boolean checkOut = false;
    Book(boolean check){
        checkOut = check;
    }
    void checkIn(){
        checkOut = false;
    }
    protected void finalize() {
        if(checkOut) {
            System.out.println("This is an Error");
            //super.finalize();
        }
    }
    //super.finalize();
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();
    }
}
