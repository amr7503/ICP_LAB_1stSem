import java.util.Scanner;

public class Q8_RandomGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int comp,user;
		do{
			comp=(int)(Math.random()*10)+1;
			
			System.out.print("User guess : ");
			user=sc.nextInt();
			System.out.println("Computer guess : "+comp);
			//System.out.println("User guess : "+user);
			if(user<comp)
				System.out.println("Too low , try again");
			else if(user>comp)
				System.out.println("Too high ,  try again");
			else
				System.out.println("Good guess");
			
			
		}while(comp!=user);
		
		

	}

}
