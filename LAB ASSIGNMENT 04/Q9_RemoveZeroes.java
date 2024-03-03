import java.util.Scanner;

public class Q9_RemoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int no=0,m=1;
		
		while(n!=0)
		{
			int d=n%10;
			if(d!=0)
			{
				no=no+d*m;
				m*=10;
			}
			
			n/=10;
		}
		
		System.out.println("Output = "+no);
	}

}
