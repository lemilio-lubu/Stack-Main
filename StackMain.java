import java.util.Arrays;

public class StackMain {
    private int[] elementsStack;
    private int top;
    private int sizeStack;

    public StackMain(int sizeStack) {
        this.sizeStack = sizeStack;
        this.top = -1; //main variable in the stack
        this.elementsStack = new int[sizeStack]; //place where we keep the elements of the stack
    }

    public void push(int value) {
        //look if stack is full
        if (isFull()) {
            System.out.println("overflow");
            return;
        }
        //first value in the stack
        if (isFirstValue()) {
            top = 0; //move to the first space
            elementsStack[top] = value; //add element
            return;
        }
        //value in the stack
        top += 1; //increase value
        elementsStack[top] = value;
    }

    private boolean isFirstValue() {
        return top == -1;
    }

    private boolean isFull() {
        return top == sizeStack - 1;
    }

    public void pop() {
        //look if stack is empty
        if (isEmpty()) {
            System.out.println("underflow");
            return;
        }
        //last value
        if (isLastValue()) {
            elementsStack[top] = 0; //remove top element
            top = -1; //turn on stack empty
            return;
        }
        //remove top's value in the stack
        elementsStack[top] = 0;
        top -= 1; //decrease value
    }

    private boolean isLastValue() {
        return top == 0;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void top() {
        if(!isEmpty()){
            System.out.println("\t" + elementsStack[top]);
            return;
        }
        System.out.println("Stack is empty");
    }

    @Override
    public String toString() {
        String report = "******* STACK ***********\n";
        for (int i = sizeStack -1; i > -1; i--) {
            report += "\t["+ elementsStack[i] +"]\n";
        }
        return report;
    }
}
