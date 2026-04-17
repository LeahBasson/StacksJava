
package za.ac.cput;


public class RunStacksPractice {

    
    public static void main(String[] args) {
        // stacks with arrays
        // Stack class containing stack creation using an array
        // Stack methods in stack class aswell
        
        StackClass aStack = new StackClass();
        
        aStack.push(5);
        aStack.push(2);
        aStack.push(7);
        
        aStack.print();
        
        System.out.println("Stack size: " + aStack.size());
        System.out.println("\nElement popped: " + aStack.pop());
        aStack.print();
        
        System.out.println("\nStack size: " + aStack.size());
        System.out.println("Peek: " + aStack.peek());
        
        System.out.println("-----------------------------------");
        
    }// end of main
    
}// end of class
