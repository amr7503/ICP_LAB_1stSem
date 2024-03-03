import java.util.*;
public class Q6_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base : ");
		int a=sc.nextInt();
		System.out.print("Enter the power : ");
		int b=sc.nextInt();
		
		int i,pow=1;
		
		for(i=1;i<=b;i++)
			pow*=a;
		
		System.out.println(a+" to the power "+b+" is: "+pow);

	}

}
