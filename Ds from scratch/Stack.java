
class MyStack{
    private int capacity;
    private int data[];
    private int top;

    public MyStack(){
        capacity=10;
        data=new int[capacity];
        top=-1;
    }

    public void push(int val){
        ensureCapacity();
        data[++top]=val;
    }

    public void ensureCapacity(){
        if(top+1==capacity){
            capacity=capacity*2;
            int newData[]=new int[capacity];
            for(int i=0;i<=top;i++){
                newData[i]=data[i];
            }
            data=newData;
        }
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("stack out of bounds exception ");
        }
        return data[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    public int size(){
        return top+1;
    }

    public void printStack(){
        for(int i=top;i>=0;i--){
            System.out.println(data[i]+" ");
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Output: 30 20 10

        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Now Top: " + stack.peek()); // 20
        System.out.println("Size: " + stack.size()); // 2

        stack.printStack(); // Output: 20 10
    }
}
