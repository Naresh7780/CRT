
public class Prblm
{
	public static void main(String[] args) {
		int val=ways(10);
		System.out.println(val);
	}
	public static int ways(int n){
	    if(n==0||n==1){
	        return 1;
	    }
	    return ways(n-2)+ways(n-1);
	}
}
