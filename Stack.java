package dataStrProblems;

public class Stack<K> {
	StackLinkedList<K> stack = new StackLinkedList<K>();
	public static int top = 0;
	
	public void push(K data) {
		stack.add(data);
		top++;
	}
	
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Underflow");
		} else {
			stack.deleteAtEnd();
			top--;
		}
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public K peek() {
		if (!isEmpty()) {
			K data;
			data = (K) stack.get(top);
			return data;
		}
		return null;
	}
	
	public int size() {
		return top;
	}
}
