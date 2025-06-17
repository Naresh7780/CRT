
public class LinkedList1 {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		linkedList list = linkedList.arrayToList(nums);
		list.insertBeg(50);
		list.deleteEnd();
		list.print();

	}
}
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next= null ;
	}
}
class linkedList {
	Node head;
	linkedList() {
		this.head= null;
	}
	void insertBeg(int data) {
		Node newNode= new Node(data);
		newNode.next=head;
		head= newNode;
	}
	void insertEnd(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head= newNode;
			return;
		}
		Node temp= head;
		while(temp.next!= null) {
			temp= temp.next;
		}
		temp.next= newNode;
	}
	void insertPos(int data,int Pos) {
		Node newNode= new Node(data);
		int length=0;
		Node temp= head;
		while(temp!= null) {
			length= length+1;
			temp=temp.next;
		}
		if(Pos>=0 && Pos<=length) {
			if(Pos==0) insertBeg(data);
			else if (Pos== length) insertEnd(data);
			else {
				temp= head;
				for(int i=1; i<Pos; i++) {
					temp=temp.next;
				}
				newNode.next=temp.next;
				temp.next=newNode;
			}
		}
		else {
			System.out.println("The Pos is invalid");
		}
	}
	Node getHead() {
		return head;
	}
	int length(){
	    int length1=0;
	    Node temp =head;
	    while(temp!=null){
	        length1++;
	        temp=temp.next;
	    }
	    return length1;
	}
	public void print(){
	    Node temp = head;
	    while(temp != null){
	        System.out.print(temp.data + " --> ");
	        temp = temp.next;
	    }
	    System.out.print("null\n");
	}
	int deleteBeg(){
	    if(head==null){
	        System.out.println("There are no elements");
	        return -1;
	    }
	    int removedEle= head.data;
	    head =head.next;
	    return removedEle;
	}
	int deleteEnd(){
	    int length1 = length();
	    Node temp=head;
	    if(length1==0){
	        System.out.println("NO ele");
	        return -1;
	    }
	    else if (length1==1){
	        int removedEle=head.data;
	        head=null;
	        return removedEle;
	    }
	    else{
	        for(int i=1;i<length1- 1;i++){
	            temp=temp.next;
	        }
	        int removedEle=temp.next.data;
	        temp.next=null;
	        return removedEle;
	    }
	}
	int deletePos(int pos){
	    int length1 =length();
	    return 1;
	}


    public static linkedList arrayToList(int nums[]){
        linkedList list  = new linkedList();
        for(int num : nums){
            list.insertEnd(num);
        }
        return list;
    }
    
}
