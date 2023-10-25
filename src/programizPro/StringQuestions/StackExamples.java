package programizPro.StringQuestions;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Joseph");
        stack.push("Joy");
        stack.push("Ender");
      //  System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.search("Ender"));

      Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(30);
        stack1.push(43);
        stack1.push(76);
        System.out.println(stack1.empty());
        System.out.println(stack1.size());
        System.out.println(stack1);
       // System.out.println(stack1.pop());
        System.out.println(stack1.search(76));
        System.out.println(stack1);
    }
}
