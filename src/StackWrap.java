import java.util.Stack;

public class StackWrap {
	Stack<Integer> stack = new Stack<Integer>();
	
	public int pop() {
		return stack.pop();
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public void push(int i) {
		stack.push(i);
		return;
	}
	
	public boolean empty() {
		return stack.empty();
	}
	
	public void remove(int i) {
		stack.remove(i);
	}
	
	public boolean contains(int i) {
		return stack.contains(i);
	}
}
