import java.util.Scanner;

public class Q7_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number you want to find multiplicaation table : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
			System.out.println(n+"x"+i+"="+(n*i));

	}

}
