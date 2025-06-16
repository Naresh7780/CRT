

public class SumOfDigits
{
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int temp=n;
		while(temp>0)
		{
		    int rem=temp%10;
		    sum=sum+rem;
		    temp=temp/10;
		}
		System.out.println(sum);
	}
}