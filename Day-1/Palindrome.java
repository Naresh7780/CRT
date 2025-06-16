
public class Palindrome
{
	public static void main(String[] args) {
	    int num=123;
	    int rev=0;
	    int rem;
	    int temp=num;
	    while(temp>0){
	        rem=temp%10;
	        rev=(rev*10)+rem;
	        temp=temp/10;
	    }
		System.out.println(rev);
		if(rev==num){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println("not palindrome");
		}
	}
}
