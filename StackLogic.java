package dataStrProblems;

import java.util.List;

public class StackLogic<K> {
	Object[] stack = new Object[6];
	int top;

	//Push the element into stack
	public void push(Object data) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			stack[top] = data;
			top++;
		}
	}
	
   	//Pop the element from stack	
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Underflow");
		} else {
			top--;
			stack[top] = 0;
		}
	}

	//Show top element of stack
	public K peek() {
		K data;
		data = (K) stack[top - 1];
		return data;
	}


	//Check stack is empty or not
	public boolean isEmpty() {
		return top == 0;
	}
	
	//Check stack is full or not
	public boolean isFull() {
		return top == stack.length;
	}
	
	public int size() {
		return top;
	}
}	