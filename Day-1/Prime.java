import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Input: ");
		int x= sc.nextInt();
		int count=0;
		for(int i=1;i<=x;i++){
		    if(x%i==0){
		        count++;
		    }
		}
		if(count==2){
		    System.out.println("prime");
		}else
		System.out.println("not prime");
	}
}
