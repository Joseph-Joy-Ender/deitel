package w3resource;

public class Stack {
    private int[] array;
    private int top;
    public Stack(int size){
        array = new int[size];
        top = -1;
    }

    public void push(int num){
        if (top == array.length - 1){
            System.out.println("Stack is full");
        }else {
            top++;
            array[top] = num;
        }
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }else {
            int poppedElement = array[top];
            top--;
            return poppedElement;
        }
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return  array[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

}
