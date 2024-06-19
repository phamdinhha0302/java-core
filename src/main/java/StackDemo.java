import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // thêm phần tử vo đỉnh
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        // xem phần tử ở đỉnh
        int peek = stack.peek();
        System.out.println("peek = " + peek);
        // lấy phần tử  đỉnh
        int pop = stack.pop();
        System.out.println("pop = " + pop);
        // xử lý stack
        while (!stack.empty()){
            int top = stack.pop();
            System.out.println("top = " + top);
            System.out.println("stack = " + stack);
        }
        System.out.println("stack = " + stack);
    }
}
