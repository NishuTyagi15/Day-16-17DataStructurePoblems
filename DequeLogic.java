package dataStrProblems;

import java.io.*;

public class DequeLogic<K> {
	BufferedReader br;
	
	public DequeLogic(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	Deque<K> front;
	Deque<K> rear;
	int size=0;
	
	//Insert front
	public void insertFront(K key) {
		if(front == null) {  //if no element in list
			front.data = key;
			rear = front;
		}
		else { //if element in list
			Deque<K> node = null;
			node.data = key;
			node.next = front;
			front.prev = node;
			front = node;
		}
		size++;
	}
	
	//Insert rear
	public void insertRear(K key) {
		if(front==null) {  //if no element in list
			Deque<K> node = new Deque<K>(key);
			front = node;
			rear = front;
		}
		else {  //if element in list
			Deque<K> node=new Deque<>(key);
			rear.next = node;
			node.prev = rear;
			rear = node;
		}
		size++;
	}
	
	//remove front
	public K removeFront() {
		K value = null;
		if(front == null) {
			System.out.println("No Elements to Delete!");
		}
		else {
			value = front.data;
			front = front.next;
		}
		size--;
		return value;
	}
	
	//Remove rear
	public K removeRear() {
		K value = null;
		if(front == null) {
			System.out.println("No element to delete");
		}
		else {
			value = rear.data;
			rear = rear.prev;
			rear.next = null;
		}
		size--;
		return value;
	}
	
	//Check whether emplty or not
	public boolean isEmpty() {
		if(front == null)
			return true;
		else
			return false;
	}
 
	//Return size of deque
	public int size() {
		return size;
	}

	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		return "";
	}
}
