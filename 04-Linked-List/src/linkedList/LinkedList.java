package linkedList;

import java.net.URLDecoder;

/**
 * 数据存储在节点node中
 * class Node{
 * E e;
 * Node next;
 * }
 * 1--->2--->3--->null
 * 优点：真正的动态，不需要处理固定容量的问题
 * 缺点：丧失了随机访问的能力
 * 数组：用于索引有语意，支持快速查询
 * 链表：不适合用于索引有语意，动态
 *
 * @param <E>
 */
public class LinkedList<E> {
    /**
     * 节点Node
     */
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        public String toString() {
            return e.toString();
        }

        public Node getNext() {
            return next;
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表的大小
    public int getSize(
    ) {
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }



    //在索引为index的地方添加元素
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add node Failed,Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    //在链表头添加元素
    public void addFirst(E e) {
        add(e, 0);
    }

    //在链表末尾添加元素
    public void addLast(E e) {
        add(e, size);
    }

    //获得链表Index位置的元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add node Failed,Illegal index");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.e;
    }
    //获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }
    //获得链表的最有一个元素
    public E getLast(){
        return get(size-1);
    }
    //修改链表的第index个元素的值
    public void updateByIndex(E e,int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add node Failed,Illegal index");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.e=e;
    }
    //查找链表中是否元素
    public boolean contains(E e){
        Node cur=dummyHead.next;
        while (cur!=null){
            if (cur.e.equals(e)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除索引为index位置的元素
    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add node Failed,Illegal index");
        }
        Node prev=dummyHead.next;
        for (int i=0;i<index;i++){
            prev=prev.next;
        }
        Node retNode=prev.next;
        prev.next=retNode.next;
        retNode.next=null;
        size--;
        return retNode.e;
    }
    //从链表中删除第一个元素，返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    //从链表中删除最后一个元素，返回删除的元素
    public E removeLast(){
        return remove(size-1);
    }

    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        Node cur=dummyHead.next;
        while (cur!=null){
            res.append(cur+"->");
            cur=cur.next;
        }
        res.append("null");
        return res.toString();
    }
}
