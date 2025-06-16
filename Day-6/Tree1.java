
public class Tree1
{
	public static void main(String[] args) {
		Tree t= new Tree(new int[]{1,2,-1,-1,3,-1,-1});
		t.preOrder();
		System.out.println(" ");
		t.inOrder();
		System.out.println(" ");
		t.postOrder();
		System.out.println(" ");
	}
}
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index =-1;
    Tree(int[] nodes){
        this.root=buildTreesUsingArray(nodes);
        }
    public Node buildTreesUsingArray(int[]nodes){
        index++;
        if(index>=nodes.length){
            return null;
        }
        if(nodes[index]==-1)return null;
        Node newNode=new Node (nodes[index]);
        newNode.left=buildTreesUsingArray(nodes);
        newNode.right=buildTreesUsingArray(nodes);
        return newNode;
    }
    public void preOrder(){
        Node temp=this.root;
        preOrderHelper(temp);
        
    }
    private void preOrderHelper(Node temp){
        if(temp==null)return;
        System.out.print(temp.data+" ");
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);
    }
    public void inOrder(){
        Node temp=this.root;
        inOrderHelper(temp);
        
    }
    public void inOrderHelper(Node temp){
        if(temp==null)return;
        inOrderHelper(temp.left);
        System.out.print(temp.data+" ");
        inOrderHelper(temp.right);
    }
    public void postOrder(){
        Node temp=this.root;
        postOrderHelper(temp);
        
    }
    public void postOrderHelper(Node temp){
        if(temp==null)return;
        postOrderHelper(temp.left);
        postOrderHelper(temp.right);
        System.out.print(temp.data+" ");
    }
}
