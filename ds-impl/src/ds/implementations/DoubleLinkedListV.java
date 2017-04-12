package ds.implementations;

class Node{
	Node next;
	Node previous;
	Object value;
	public Node(Object value,Node next,Node previous){
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
public class DoubleLinkedListV{
	Node head;
	Node tail;
public DoubleLinkedListV(){
	head = null;
	tail = null;
}
/*
 * Adding nodes in the list with both next and previous
 */
public void addNode(int value){
	Node newNode = new Node(value,null,null);
	if(head==null){
	head = newNode;
	tail = head;
	}
	else
	{
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
	}
}
/*
 * Display the elements in the linked list in both original 
 * order and in the reverse order
 */
public void display(String order){
	if(order.equals("original")){
	while(head!=null){
		System.out.println(head.value);
		head = head.next;
	}
	}
	else if(order.equals("reverse")){
		while(tail!=null){
			System.out.println(tail.value);
			tail = tail.previous;
		}
	}
}

public static void main(String[] args){
	DoubleLinkedListV dl = new DoubleLinkedListV();
	dl.addNode(2);
	dl.addNode(5);
	dl.addNode(6);
	dl.addNode(7);
	dl.addNode(8);
	dl.display("reverse");
}
}
