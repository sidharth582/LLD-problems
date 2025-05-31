class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private java.util.HashMap<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new java.util.HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insertToHead(node);
        return node.value;
    }

    public void put(int key, int val) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = val;
            remove(node);
            insertToHead(node);
        } else {
            if (map.size() == capacity) {
                Node node = tail.prev;
                remove(node);
                map.remove(node.key);
            }
            Node newNode = new Node(key, val);
            map.put(key, newNode);
            insertToHead(newNode);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void printCache() {
        Node curr = head.next;
        while (curr != tail) {
            System.out.println("( " + curr.key + " : " + curr.value + " )");
            curr = curr.next;
        }
        System.out.println();
    }
}


public class LRU {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); 
        cache.put(3, 3);                 
        System.out.println(cache.get(2)); 
        cache.put(4, 4);                 
        System.out.println(cache.get(1)); 
        System.out.println(cache.get(3)); 
        System.out.println(cache.get(4)); 
        cache.printCache();
    }
}