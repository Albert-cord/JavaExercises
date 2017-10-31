

public class LinkedStack1 <T> {
    private static class Node <T>{
        T item;
        Node next;
        Node(){
            item = null;
            next = null;
        }
        Node(T item, Node <T>next){
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }
    private Node top = new Node<T>(); //end sentinel;
    public void push(T item) {
        top = new Node(item, top);
    }
    public T pop() {
        T result = (T) top.item;
        if(!top.end()) {
            top = top.next;
        }
        return result;
    }
    public  static void main(String[] args) {
        LinkedStack1<String> lss = new LinkedStack1<String> ();
        for(String s : "This is a LinkedStack class".split(" ")) {
            lss.push(s);
        }
        String s;
        while((s = lss.pop()) != null)
            System.out.print(s + " ");
    }
}
