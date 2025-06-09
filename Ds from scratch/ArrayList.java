
class MyArrayList {
    private int capacity;
    private int arr[];
    private int size;

    public MyArrayList(){
        capacity=10;
        arr=new int[capacity];
        size=0;
    }

    public void add(int val){
        ensureCapacity();
        arr[size++]=val;
    }

    public int get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, int value){
        checkIndex(index);
        arr[index]=value;
    }

    public int size(){
        return size;
    }
    public boolean contains(int value){
        for(int i=0;i<size;i++){
            if(arr[i]==value) return true;
        }
        return false;   
    }

    public void clear(){
        size=0;
    }

    public void remove(int index) {
        checkIndex(index);

        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
    }

    public void checkIndex(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public void ensureCapacity(){
        if(size==capacity){
            capacity=capacity*2;
            int newData[]=new int[capacity];
            for(int i=0;i<size;i++){
                newData[i]=arr[i];
            }
            arr=newData;
        }
    }

    public void printList(){
        for(int i=0;i<size;i++){
            System.out.println("element at index :" +i+" is "+arr[i]);
        }
    }
}
public class ArrayList{
    public static void main(String[] args) {
    MyArrayList list=new MyArrayList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); 

        list.set(1, 25);
        list.printList();

        list.remove(0);
        list.printList(); 

        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Size: " + list.size()); // 2

        list.clear();
        list.printList();  // Output: MyArrayList: 
    }
}