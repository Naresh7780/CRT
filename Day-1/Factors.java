

public class Factors
{
	public static void main(String[] 	args){
	    int n=28;
	    int count=0;
	    for(int i=1;i<n;i++){
	        if(n%i==0){
	            count++;
	            System.out.println(count);
	        }
	   
	    }
	    
	    if(count==3){
	        System.out.println("good number");
	    }else{
	        System.out.println("not a good number");
	    }
}
}