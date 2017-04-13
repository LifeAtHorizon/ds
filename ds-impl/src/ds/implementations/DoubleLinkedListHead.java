package ds.implementations;

/*
 * This is a doubly linked list with only the head. 
 */
class NodeD{
	NodeD next;
	NodeD previous;
	Object value;
	public NodeD(Object value, NodeD next , NodeD previous){
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
public class DoubleLinkedListHead {
NodeD head;
public DoubleLinkedListHead(){
	this.head = null;
}

public void addNode(int value){
	NodeD newNode = new NodeD(value, null, null);
	if(head==null){
		head = newNode;
	}
	else{
		head.previous = newNode;
		newNode.next = head;
		head = newNode;
	}
}

public void display(){
	while(head!=null){
		System.out.print(head.value+" ");
		head = head.next;
	}
}

public void reverseList(){
NodeD temp = null;
NodeD current = head;
temp = current;
while(temp.next!=null){
	NodeD previouscurrent = current;
	// first point the current previous to current next
	current.previous = temp.next;
	
	// Now change current to current previous
	current = current.previous;

	// Now point tem next to current next that is attaching next to the temp
	temp.next =  current.next;
	
	//Now change the current.next to previouscurrent
	current.next = previouscurrent;
	//new current previous still points to the previous current so change it to null
	
	current.previous = null;
}
head = current;
}

public static void main(String[] args){
	DoubleLinkedListHead dlh = new DoubleLinkedListHead();
	dlh.addNode(2);
	dlh.addNode(3);
	dlh.addNode(4);
	dlh.addNode(5);
	dlh.addNode(5);
	dlh.addNode(5);
	dlh.addNode(5);
	//dlh.display();
	/*
	 * reverse of the linked list
	 */
	dlh.reverseList();
	dlh.display();
}
}
