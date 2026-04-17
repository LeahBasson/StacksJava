package stackspractice;

public class StackClass {

    private static final int CAPACITY = 1000; // since its an array you have to state the size.
    private int[] data; // its an array of type integer
    private int top = -1;

    public StackClass() {
        this(CAPACITY);
    }

    public StackClass(int capacity) {
        data = new int[capacity];  // constructing the array with a given length
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int value) throws IllegalStateException {
        if (size() == data.length) { // checks if there is space
            throw new IllegalStateException("StackOverflowException");
        }
        top++; // increase index by 1.
        data[top] = value; // assign value you pushing.
    }

    public int pop() {
        int topValue = 0;
        if (!(top == -1)) { // checks if stack is not empty. 
            topValue = data[top];
            top--; // decrease the index by 1
        } else {
            System.out.println("No elements to pop. Stack is empty."); // this is when top is -1, which means its empty.

        }
        return topValue;
    }

    public int peek() {
        int topValue = 0;
        if (!isEmpty()) { // stack is not empty
            topValue = data[top]; // get the value on top of the stack
        }
        else{
            System.out.println("Cannot peek. Stack is empty.");
            topValue = -1; // empty stack
        }
        return topValue;
    }
    
    public void print(){
        for(int i = 0; i < size(); i++){
            System.out.println(data[i] + "");
        }
    }

}// end of class
