package dataStrProblems;

import java.io.*;

public class BalancedParenthesis {
	public static void main(String[] args) {
		String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		StackLogic<Character> stack = new StackLogic<Character>();
		boolean isBalanced = false;
		for (int i = 0; i < exp.length(); i++) {
			isBalanced=false;
			if (exp.charAt(i) == '(') {
				stack.push('(');
			} else if (exp.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
					isBalanced = true;
				}
			}
		}
		if (stack.isEmpty() && isBalanced) {
			System.out.println("Expression has Balanced Parenthesis");
		} else {
			System.out.println("Expression has not Balanced Parenthesis");
		}

	}
}
