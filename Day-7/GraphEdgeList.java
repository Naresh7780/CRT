import java.util.HashSet;
public class GraphEdgeList
{
	public static void main(String[] args) {
	    Graph g= new Graph(4,true);
	    g.addEdge(1,0);
	    g.addEdge(2,1);
	    g.addEdge(3,2);
	    g.addEdge(2,1);
	    g.print();
	}
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
        this.weight=1;
    }
}
class Graph{
    HashSet<Edge>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
    graph= new HashSet<Edge>();
}
public void addEdge(int src,int dest){
    if(isValid(src,dest)){
        Edge e= new Edge(src,dest);
        graph.add(e);
        if (!isDirected){
            Edge e2= new Edge(dest,src);
            graph.add(e2);
        }
    }else{
        System.out.println("Invalid");
    }
}
public void addEdge(int src,int dest,int weight){
    if (isValid(src,dest)){
        Edge e= new Edge(src,dest,weight);
        graph.add(e);
        if(! isDirected){
            Edge e2=new Edge(dest,src,weight);
            graph.add(e2);
        }
    }else{
        System.out.println("Invalid");
    }
}
public boolean isValid(int src,int dest){
    return src>=0 && dest>=0 && src<vertices && dest<vertices;
}
void print(){
    System.out.println(graph);
}
}
