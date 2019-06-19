package StackByLinkedList;

public class Main {
    public static void main(String []args){
        LinkedListStack linkedListStack=new LinkedListStack();
        for (int i=0;i<5;i++){
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }
        linkedListStack.pop();
        System.out.println(linkedListStack);
    }
}
