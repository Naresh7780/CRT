
public class StackbyLinkedlist
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.print();
	}
}
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Stack {
	Node head;
	Stack() {
		this.head=null;
	}
	boolean isempty() {
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}

	void push(int val) {
		Node newnode= new Node(val);
		if(isempty()) {
			this.head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;

	}

	void pop() {
		if(isempty()) {
			return;
		}
		Node temp =head;
		head=head.next;
	}

	int peak() {
		if(isempty()) {
			return -1;
		}
		return head.data;
	}
	
	void print(){
	    Node temp = head;
	    while(temp !=null){
	        System.out.println(temp.data);
	        temp = temp.next;
	    }
	}

}
