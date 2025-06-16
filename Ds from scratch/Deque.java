class MyDeque{
    private static class Node{
        String value;
        Node prev,next;
        Node(String value){
            this.value=value;
        }
    }
    private Node head,tail;
    private int size;

    public void addFirst(String value){
        Node newNode=new Node(value);
        if(head==null) head=tail=newNode;
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    public void addLast(String value){
        Node newNode=new Node(value);
        if(tail==null) head=tail=newNode;
        else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    public String removeFirst(){
        if(size==0) throw new RuntimeException("Deque is empty");
        String val=head.value;
        head=head.next;
        if(head!=null) head.prev=null;
        else tail=null;
        size--;
        return val;
    }

    public String removeLast(){
        if(size==0) throw new RuntimeException("Deque is empty");
        String val=tail.value;
        tail=tail.prev;
        if(tail!=null) tail.next=null;
        else head=null;
        size--;
        return val;
    }

    public String peekFirst(){
        if(size==0) throw new RuntimeException("Deque is empty");
        return head.value;
    }

    public String peekLast(){
        if(size==0) throw new RuntimeException("Deque is empty");
        return tail.value;
    }

    public int size() {
        return size;
    }
}

public class Deque{
    
    public static void main(String[] args) {
        MyDeque deque = new MyDeque();

        // Initial state
        if (deque.size() != 0) {
            throw new AssertionError("Expected size 0, got " + deque.size());
        }

        // Add elements
        deque.addFirst("10"); // 10
        deque.addLast("20");  // 10 20
        deque.addFirst("5");  // 5 10 20

        if (deque.size() != 3) {
            throw new AssertionError("Expected size 3, got " + deque.size());
        }
        if (!deque.peekFirst().equals("5")) {
            throw new AssertionError("Expected first 5, got " + deque.peekFirst());
        }
        if (!deque.peekLast().equals("20")) {
            throw new AssertionError("Expected last 20, got " + deque.peekLast());
        }

        // Remove from front
        if (!deque.removeFirst().equals("5")) {
            throw new AssertionError("Expected removeFirst 5");
        }
        if (!deque.peekFirst().equals("10")) {
            throw new AssertionError("Expected first 10, got " + deque.peekFirst());
        }

        // Remove from back
        if (!deque.removeLast().equals("20")) {
            throw new AssertionError("Expected removeLast 20");
        }
        if (!deque.peekLast().equals("10")) {
            throw new AssertionError("Expected last 10, got " + deque.peekLast());
        }

        // Final remove
        if (!deque.removeFirst().equals("10")) {
            throw new AssertionError("Expected removeFirst 10");
        }
        if (deque.size() != 0) {
            throw new AssertionError("Expected empty deque");
        }

        System.out.println("All tests passed!");

        // assertTrue(deque.isEmpty());
        // assertEquals(0, deque.size());

        // // Add elements
        // deque.addFirst(10); // 10
        // deque.addLast(20);  // 10 20
        // deque.addFirst(5);  // 5 10 20

        // assertEquals(3, deque.size());
        // assertEquals(5, deque.peekFirst());
        // assertEquals(20, deque.peekLast());

        // // Remove from front
        // assertEquals(5, deque.removeFirst());
        // assertEquals(10, deque.peekFirst());

        // // Remove from back
        // assertEquals(20, deque.removeLast());
        // assertEquals(10, deque.peekLast());

        // // Final remove
        // assertEquals(10, deque.removeFirst());
        // assertTrue(deque.isEmpty());
    }
}