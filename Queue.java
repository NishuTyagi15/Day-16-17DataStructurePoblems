package dataStrProblems;

import java.util.Scanner;

public class Queue<K> {
	QueueLinkedList<K> queue = new QueueLinkedList<K>();
	int index = 0;
	public int bankBalance = 500000;
	Scanner S = new Scanner(System.in);
	int counter = 1;
	
	public void enQueue(K data) {
		queue.add(data);
		index++;
	}
	
	public int size() {
		return index;
	}
	
	public K get() {
		return queue.get(index);
	}
	
	public K get(int ind) {
		return queue.get(ind);
	}
}