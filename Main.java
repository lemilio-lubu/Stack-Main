
public class Main {
    public static void main(String[] args) {
        StackMain stackMain = new StackMain(20);
        //Value of sizeStack can be changed

        stackMain.push(2); //Adds an item to the stack
        stackMain.push(-1); //Adds -1 on item to the stack
        stackMain.push(3); //Adds -1 on item to the stack
        stackMain.push(4); //Adds -1 on item to the stack
        stackMain.push(-2); //Adds -1 on item to the stack
        stackMain.push(1); //Adds -1 on item to the stack

        stackMain.pop(); //Removes with LIFO, use top of the stack
        stackMain.pop(); //Removes with LIFO

        stackMain.top(); //returns top of the stack without removing anything

        System.out.println(stackMain);
    }
}