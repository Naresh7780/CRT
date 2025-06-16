
public class Fibi
{
	public static void main(String[] args) {
	    int f1=0;int f2=1;
	    int f3;
	    int c=2;
	    int n=8;
	    System.out.println(f1);
	    System.out.println(f2);
	    while(c<n){
	        
	        f3=f1+f2;
	        f1=f2;
	        f2=f3;
	        c=c+1;
	        
	        System.out.println(f3);
	    }
	
	}
}
