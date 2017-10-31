

public class LinkedStack2 <T> {
    private static class Node {
        Node next;
        Object  item;
        Node(){
            item = null;
            next = null;
        }
        Node(Object item, Node next){
            this.item = item;
            this.next = next;
        }
        
        boolean end() {
            return item == null && next == null;
        }
    }
    private Node top = new Node(); //end sentinel;
    public void push(Object item) {
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
        LinkedStack2<String> lss = new LinkedStack2<String> ();
        for(String s : "This is a LinkedStack class".split(" ")) {
            lss.push(s);
        }
        String s;
        while((s = lss.pop()) != null)
            System.out.print(s + " ");
    }
}