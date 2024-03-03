import java.util.Scanner;

public class Q10_LargestPowerOf3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		int p=3;
		
		while(p*3<=n) p*=3;
		
		
	   System.out.println("The largest power of 3 less than or equal to "+n+" is "+p);
		

	}

}
