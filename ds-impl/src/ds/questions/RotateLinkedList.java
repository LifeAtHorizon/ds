package ds.questions;
class Node{
	Node next;
	Object value;
	
	Node(Object value,Node next){
		this.value = value;
		this.next = next;
	}
}
class LinkedListv{
	
	Node head;
	Node temp;
	public LinkedListv() {
	this.head = null;
	}
	public void addNode(int value){
		Node newNode = new Node(value,null);
		
		if(head==null){
			head = newNode;
			temp = head;
		}
		else{
			temp.next = newNode;
			temp = newNode;
		}
	}
	
	public void rotate(int pivot){
		pivot = pivot -1;
	// assign a temp node for head 
		Node temp1 = head;
		if(pivot>0){
	// traverse till you reach the pivot : eg : 4
		int i=0;
		while(i<pivot-1){
			temp1 = temp1.next;
			i++;
		}
		// Assign new Node to the next node and make the next node of previous null
		Node newHead = temp1.next;
		temp1.next = null;
		temp1 = newHead;
		while(temp1.next!=null){
			temp1 = temp1.next;
		}
		temp1.next = head;
		head = newHead;
		}
	}
	
	public void display(){
		Node temp1 = head;
		while(temp1!=null){
			System.out.println(temp1.value);
			temp1 = temp1.next;
		}
	}
}
public class RotateLinkedList {
public static void main(String[] args){
	LinkedListv lk = new LinkedListv();
	lk.addNode(1);
	lk.addNode(2);
	lk.addNode(3);
	lk.addNode(4);
	lk.addNode(5);
	lk.addNode(6);
	lk.addNode(7);
	lk.rotate(0);
	lk.display();
}
}
