package dataStrProblems;

public class LinkedList<K> {
	Node<K> head;
	int size = 0;
	
	public String show() {
		String str = "";
		Node<K> h = head;
		if (head == null) {
			return "no data";
		} else {
			while (h.next != null) {
				str += h.data + " ";
				h = h.next;
			}
			str += h.data;
		}

		return str;
	}
	
	public String returnListInString() {
		String str = "";
		Node<K> h = head;
		while (h.next != null) {
			str += h.data + ",";
			h = h.next;
		}
		str += h.data;
		return str;
	}
	
	public int searchNode(K key, int size) {
		boolean isFound = false;
		int counter = -1;
		Node<K> h = head;
		while (h.next != null) {
			counter++;
			if (h.data.equals(key)) {
				isFound = true;
				break;
			}
			h = h.next;
		}
		if (isFound) {
			System.out.println("key found and deleting...");
			deleteAt(counter);
			size--;
		} else if (h.data.equals(key)) {
			System.out.println("key found at last and deleting...");
			counter++;
			deleteAt(counter);
			size--;
		} else {
			System.out.println("key not found and inserting...");
			size++;
			add(key);
		}
		return size;
	}
	
	public void add(Object data) {
		Node<K> nodenew = new Node<K>();
		nodenew.data = (K) data;
		if (head == null) {
			head = nodenew;
			size++;
		}

		else {
			Node<K> h = head;
			while (h.next != null) {
				h = h.next;
			}
			h.next = nodenew;
			size++;
		}
	}
	
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<K> h = head;
			Node<K> h1 = null;
			for (int i = 0; i < index - 1; i++) {
				h = h.next;
			}
			h1 = h.next;
			h.next = h1.next;
			System.out.println("Node deleted is: " + h1.data);
			h1 = null;
		}
		size--;
	}
	
	public <K extends Comparable<K>> void sort(int size) {
		Node<K> h = (Node<K>) head;
		Node<K> h1 = h.next;
		K temp;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j <= size - 1 - i - 1; j++) {

				if (h.data.compareTo(h1.data) > 0) {
					temp = h.data;
					h.data = h1.data;
					h1.data = temp;
				}
				h1 = h1.next;
			}
			h = h.next;
			h1 = h.next;
		}
	}
}
