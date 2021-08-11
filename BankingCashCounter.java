package dataStrProblems;

import java.io.*;
import java.util.Scanner;

public class BankingCashCounter {
	public static void main(String[] args) {
		QueueLogic<Integer> queue = new QueueLogic<Integer>();
		System.out.println("Enter how many Times you want use Service: ");
		Scanner S = new Scanner(System.in);
		int people = S.nextInt();

		System.out.println("Hi! Welcome to Bank Simulation: ");
		for (int i = 0; i < people; i++) {

			queue.enQueue(i);
			queue.service();
			queue.deQueue();
		}
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		System.out.println("Bank Closing Balance is : " + queue.bankBalance);
		S.close();
	}
}
