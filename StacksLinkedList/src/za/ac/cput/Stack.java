package za.ac.cput;

public class Stack {

    private static class Node {

        private int value;
        private Node next; // pointer

        public Node(int v, Node n) {
            value = v;
            next = n; // points to null
        }
    }// end of Node class

    private Node head = null;
    private int size = 0;

    // Other methods
    public void push(int value) {
        head = new Node(value, head); // has a next pointer to head
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public int pop() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("StackEmptyException");
        int value = head.value; // head points to the 1st value;
        head = head.next; // assign address of the first value to the head so then head points to the next values address
        size--;
        return value;
    }
    
    public int peek() throws IllegalStateException{
        if(isEmpty()){
            throw new IllegalStateException("StackEmptyException");
        }
        return head.value; // returns the top element which is the first element in a linked list
    }
    
    public void print(){
        Node temp = head;
            while(temp != null){
                System.out.println(temp.value + "");
                temp = temp.next;
            }
    }
}// end of stack class
