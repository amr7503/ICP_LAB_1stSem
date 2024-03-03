import java.util.*;
public class Q4_GCD {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a=sc.nextInt();
		System.out.print("Enter the second number : ");
		int b=sc.nextInt();
		
		while(a%b!=0)
		{ 
			int t = a%b;
			a=b;
			b=t;
			
		}
		
		System.out.println("GCD = "+b);

	}

}
