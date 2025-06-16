
public class StackbyArray {
	public static void main(String[]args) {
		Stack s= new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.print();
		System.out.println("The peak is "+ s.peak());

	}
}
class Stack{
    int [] Stack;
    int size;
    int top;
    int length;
    Stack(int size){
        this.size= size;
        this.Stack= new int[size];
        this.top= -1;
    }
    boolean isFull(){
        if(top==length-1){
            System.out.println("stack is full");
            return true;
        }
        else return false;
    }
    boolean isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            return false;
        }
    }
    void push(int val){
        if(isFull()){
            return;
        }
        top=top+1;
        Stack[top]=val;
    }
    int pop(){
        if( isEmpty()){
            return -1;
        }
        int val=Stack[top];
        top= top-1;
        return val;
    }
    int peak(){
        if(isEmpty()){
            return -1;
        }
        return Stack[top];
    }
    void print(){
        for (int i=top;i>=0;i--){
            System.out.println("|"+Stack[i]+"|");
        }
    }
}