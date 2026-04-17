package za.ac.cput;

public class RunStacksLinkedList {

    public static void main(String[] args) {
        // Stacks + Linked Lists
        Stack linkedlist = new Stack();

        for (int i = 1; i <= 10; i++) {
            linkedlist.push(i);
        }
        
        System.out.println("---- After pushing 10 nodes onto stack ----");
        linkedlist.print();
        
        System.out.println("---- Peek into stacked linked list ----");
        System.out.println("\nHead of stacked linked list" + linkedlist.peek());
        
        for(int i = 1; i <= 5; i++){
            System.out.println("popped: " + linkedlist.pop());
        }
        
        System.out.println("---- After popping 5 nodes from the stack ----");
        linkedlist.print();
        
    }// end of main

}// end of class
