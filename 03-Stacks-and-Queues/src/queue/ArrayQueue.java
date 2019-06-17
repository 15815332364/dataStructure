package queue;

public class ArrayQueue<E> implements Queue<E>{

    private DynamicArray<E> array;
    public ArrayQueue(int capacity){
        array=new DynamicArray<>(capacity);
    }
    public ArrayQueue(){
        array=new DynamicArray<>();
    }

    public int getSize(){
        return array.getSize();
    }
    public boolean isEmpty(){
        return array.isEmpty();
    }
    public void enqueue(E e){
        array.addLast(e);
    }
    public E dequeue(){
        return array.removeFirst();
    }
    public E getFront(){
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
            res.append("Queue：");
        res.append("front[");
        for (int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if (i!=array.getSize()-1){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
