

class MyQueue {
    private int data[];
    private int capacity;
    private int size;
    private int rear;

    public MyQueue() {
        this.capacity = 5; 
        this.data = new int[capacity];
        this.size = 0;
        this.rear = 0;
    }

    public void enqueue(int val) {
        if (size == capacity) {
            resize();
        }
        data[rear++] = val;
        size++;
    }

    public void dequeue() {
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        rear--;
    }

    public int peek() throws Exception{
        if(size==0) throw new Exception("Queue is full");
        return data[0];
    }

    public void resize() {
        capacity = 2 * capacity;
        int newdata[] = new int[capacity];
        for(int i = 0; i < size; i++) {
            newdata[i] = data[i];
        }
        data = newdata;
        rear=size;
    }

    public void printQueue(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}

public class Queue{
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        
    }
}