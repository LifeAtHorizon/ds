package ds.questions;
import ds.implementations.DoubleLinkedListV;
/* 
 * Reverse a doubly linked list
 */


public class ReverseDoublyLinkedList {
	DoubleLinkedListV linkedlist;
	public ReverseDoublyLinkedList(){
		linkedlist = new DoubleLinkedListV();
	}
public  void fillList(int[] numberstobefilled){
	int i = numberstobefilled.length;
	int j = 0;
	while(j<i){
		linkedlist.addNode(numberstobefilled[j]);
		++j;
	}
}

public void originaldisplay(){
	System.out.println();
	linkedlist.display("original");
}

public void reverseOrder(){
	System.out.println();
	linkedlist.display("reverse");
}

public static void main(String[] args){
	ReverseDoublyLinkedList revlist = new ReverseDoublyLinkedList();
	int[] array = {3,4,5};
	
	revlist.fillList(array);
	revlist.originaldisplay();
	revlist.reverseOrder();
}
}
