
package stacksexample;

import java.util.Stack;

public class StacksExample {

    
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        
        fruit.push("Apple");
        fruit.push("Mango");
        fruit.push("Orange");
        
        // 3. peek() - View the top element without removing it
        System.out.println("Top element: " + fruit.peek()); // Output: Cherry

        // 4. pop() - Remove and return the top element
        String removed = fruit.pop();
        System.out.println("Popped: " + removed);           // Output: Cherry

        // 5. empty() - Check if the stack is empty
        System.out.println("Is empty? " + fruit.empty());    // Output: false

        // 6. search() - Find 1-based position from the top
        int position = fruit.search("Apple");
        System.out.println("Position of Apple: " + position); // Output: 2
        
    }// end of main
    
}// end of class
