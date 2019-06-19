package QueueByLinkedList;

public class LinkedListQueue<E> implements Queue<E> {
    private class Node{
        public E e;
        public Node next;
        public Node(E e,Node next){
            this.e=e;
            this.next=next;
        }
        public Node(E e){this(e,null);}
        public Node(){ this(null,null);}
        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head,tail;
    private int size;

    public LinkedListQueue(){
        head=null;
        tail=null;
        size=0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(E e){
        if (tail==null){
            tail=new Node(e);
            head=tail;
        }else {
            tail.next=new Node(e);
            tail=tail.next;
        }
        size++;
    }
    //入队
    public E dequeue(){
        if (isEmpty()){
            throw new IllegalArgumentException("can not dequeue from an empty queue.");
        }
        Node retNode=head;
        head=head.next;
        retNode.next=null;
        if (head==null){
            tail=null;
        }
        size--;
        return retNode.e;
    }
    public E getFront(){
        if (isEmpty()){
            throw new IllegalArgumentException("can not dequeue from an empty queue.");
        }
        return head.e;
    }
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append("Queue:front:");
        Node cur=head;
        while (cur!=null){
            res.append(cur+"->");
            cur=cur.next;
        }
        res.append("null tail");
        return res.toString();
    }

}