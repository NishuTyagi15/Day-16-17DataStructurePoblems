package dataStrProblems;

public class QueueLinkedList<K> {
	Node<K> head;
	int size = 0;
	
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
	
	public void deleteAtEnd() {
		if (!isEmpty()) {
			Node<K> h = head;

			while (h.next != null) {
				h = h.next;
			}
			h.next = null;
		} else {
			System.out.println("Linked list is empty nothing to delete");
		}
		size--;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public K get(int index) {
		if (index == 0)
			return head.data;
		else {
			Node<K> h = head;
			for (int i = 0; i < index; i++) {
				if (h.next != null) {
					h = h.next;
				} else {
					return null;
				}
			}
			return h.data;
		}
	}
}
