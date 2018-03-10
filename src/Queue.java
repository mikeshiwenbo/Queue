import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
	private Node first;
	private Node last;
	private class Node{
		Item item;
		Node next;
	}
	private int N;
	public boolean isEmpty(){
		return first==null;
	}
	public int size(){
		return N;
	}
	public void enqueue(Item item){
		Node oldlast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		if(N==0){
			first=last;
		}else{
			oldlast.next=last;
		}
		N++;
	}
	public Item dequeue(){
		Item item=first.item;
		first=first.next;
		if (isEmpty()) last=null;
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ArrayQueue();
	}
	private class ArrayQueue implements Iterator<Item> {
		
		private Node current=first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item=current.item;
			current=current.next;
			return item;
		}
		

	}

}
