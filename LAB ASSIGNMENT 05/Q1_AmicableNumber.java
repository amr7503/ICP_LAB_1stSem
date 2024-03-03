import java.util.*;
public class Q1_AmicableNumber 
{
	public static void main(String args[])
  {
	int n1,n2,s1=0,s2=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number :");
	n1=sc.nextInt();
	System.out.print("Enter second number :");
	n2=sc.nextInt();
	
	for(int i=1;i<n1;i++)
		if(n1%i==0)
			s1+=i;
	for(int i=1;i<n2;i++)
		if(n2%i==0)
			s2+=i;
	
	if(n1==s2 && n2==s1)
		System.out.println(n1+" and "+n2+" are amicable numbers");
	else
		System.out.println(n1+" and "+n2+" are not amicable numbers");
	
  }
}
