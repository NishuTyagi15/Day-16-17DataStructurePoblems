package dataStrProblems;

public class PalindromeChecker {
	public static void main(String[] args) {
		DequeLogic<Character> d = new DequeLogic<Character>();
		System.out.println("Enter a String: ");
		String S = d.inputString();

		//adding each character to the rear of the deque
		for(int i = 0; i < S.length(); i++) {
			char key = S.charAt(i);
			d.insertRear(key);
		}
		int flag = 0;

		while(d.size() > 1) {
			if(d.removeFront() != d.removeRear()) {
				flag=1;
				break;
			}
		}

		if(flag == 0) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
