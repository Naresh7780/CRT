import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class Dfs{
	public static void main(String[] args) {
		Graph g= new Graph(5,true);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,4);
		g.addEdge(1,3);
		g.addEdge(1,2);
		g.addEdge(2,1);
		g.addEdge(2,4);
		g.addEdge(3,1);
		g.addEdge(4,1);
		g.addEdge(4,3);
		g.printgraph();
		g.dfs(0,new boolean[5]);
	}
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices=vertices;
        this.isDirected=isDirected;
        this.graph=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<>());
        }
    }
    public void addEdge(int s,int d){
        if(isValid(s,d)){
            this.graph.get(s).add(d);
            if(!isDirected){
                this.graph.get(d).add(s);
            }
        }else{
                System.out.println("Invalid s and d");
            }
    }
    public void removeEdge(int s,int d){
        if(isValid( s, d)){
            this.graph.get(s).remove(d);
            if(!isDirected){
                this.graph.get(d).remove(s);
            }else{
                System.out.println("Invalid s and d");
            }
        }
    }
    boolean isValid(int s,int d){
        return (s>=0 && d>=0 && s<this.vertices && d<this.vertices && s!=d);
    }
    boolean isHavingEdge(int s,int d){
        return this.graph.get(s).contains(d);
    }
    HashSet<Integer>getNeighbours(int s)throws IndexOutOfBoundsException{
        if(s>=0 && s<vertices){
            return this.graph.get(s);
        }
        System.out.println("Invalid s and d");
        return this.graph.get(s);
    }
    void printgraph(){
        System.out.println(graph);
    }
    void dfs(int s,boolean[] visited){
        visited[s]=true;
        System.out.println(s+" ");
        var neibhours=getNeighbours(s);
        for(var neibhour: neibhours){
            if(!visited[neibhour]){
                dfs(neibhour,visited);
            }
        }
    }
}
