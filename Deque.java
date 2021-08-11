package dataStrProblems;

public class Deque<K> {
	public K data;
	public Deque<K>next;
	public Deque<K>prev;
	
	public Deque()
	{
		this.next=null;
		this.prev=null;
	}
	
	public Deque(K value)
	{
		this.data=value;
		this.next=null;
		this.prev=null;
	}
}
