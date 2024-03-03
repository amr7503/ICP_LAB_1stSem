import java.util.Scanner;

public class Q5_PerfectNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		int s=0;
		
		for(int i=1;i<n;i++)
			if(n%i==0) 
				s+=i;
		
		if(s==n)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");

	}

}
