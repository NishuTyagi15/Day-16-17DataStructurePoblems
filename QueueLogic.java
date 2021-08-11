package dataStrProblems;

import java.util.List;
import java.util.Scanner;

public class QueueLogic<K> {
	Object[] queue = new Object[10];
	int front;
	int rear;
	int size;
	public int bankBalance = 500000;
	Scanner S = new Scanner(System.in);
	int counter=1;

	//Method for enqueue the element	 
	public void enQueue(K data) {
		queue[rear] = data;
		rear = (rear + 1) % 5;
		size = size + 1;
		if (isFull()) {
			System.out.println("Queue is full removing first value");
		}
	}

	//Method for dequeue the element
	public K deQueue() {
		K data = (K) queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1;
		} else {
			System.out.println("Queue is Empty nothing to Delete!");
		}
		return data;
	}

	//Method for getting size of queue
	public int getSize() {
		return size;
	}

	//Method for checking queue is empty
	public boolean isEmpty() {
		return getSize() == 0;
	}

	//Method for checking queue is full
	public boolean isFull() {
		return getSize() == 5;
	}

	//Method for serving people who are in queue
	public void service() {
		System.out.println("Token number is : " + counter);
		
		int choice;
		int amount=0;
		System.out.println("press 1: for withdraw\npress 2: for deposit");
		choice = S.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter Amount to Withdraw");
			amount = S.nextInt();
			bankBalance = bankBalance - amount;
			System.out.println("Thank you for using our Service!");
			amount=0;
			break;
		case 2:
			System.out.println("Enter Amount to Deposit : ");
			amount = S.nextInt();
			bankBalance = bankBalance + amount;
			System.out.println("Thank you for using our Service!");
			amount=0;
			break;
		default:
			System.out.println("Choose a valid option!");
		}
		counter++;		
	}
}	