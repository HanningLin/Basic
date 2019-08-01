package Stack.Impl;

public class Main {

    public static void main(String[] args) {
        ArrayStackImpl<Integer> stack = new ArrayStackImpl();
        stack.push(1);
        stack.print();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("peak:" + stack.peek());
        stack.print();
        stack.pop();
        stack.print();
        System.out.println('\n');


        LinkedListStackImpl<Integer> stack1 = new LinkedListStackImpl<>();
        stack1.push(1);
        stack1.print();
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        stack1.print();
        stack1.pop();
        stack1.print();

    }
}
