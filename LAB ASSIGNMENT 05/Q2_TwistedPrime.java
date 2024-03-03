import java.util.*;
public class Q2_TwistedPrime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int no=n,rev=0;
		while(no!=0)
		{
			rev=rev*10+no%10;
			no/=10;
		}
		boolean flag1=true,flag2=true;
		for(int i=2;i<n;i++)
			if(n%i==0)
			{
				flag1=false;
				break;
			}
		for(int i=2;i<rev;i++)
			if(rev%i==0)
			{
				flag1=false;
				break;
			}
		if(flag1 && flag2)
			System.out.println(n+" is twisted prime");
		else
			System.out.println(n+" is not twisted prime");

	}

}
