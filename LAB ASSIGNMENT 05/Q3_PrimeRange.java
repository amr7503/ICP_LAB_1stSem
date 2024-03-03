import java.util.*;
public class Q3_PrimeRange 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number : ");
	int a=sc.nextInt();
	System.out.print("Enter the second number : ");
	int b=sc.nextInt();
	
	System.out.print("Prime numbers between "+a+" and "+b+" are: ");
	
	for(int n=a;n<=b;n++)
	{
		boolean flag=true;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
			if(n%i==0)
				{ 
				 flag=false; 
				 break; 
				}
		
		if(flag)
			System.out.print(n+" ");
				
	}
  }

}
