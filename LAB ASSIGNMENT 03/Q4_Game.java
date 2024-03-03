import java.util.*;
public class Q4_Game 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);

    int rnum=(int)(Math.random()*9+1);

    System.out.print("Enter user number: ");
    int num=sc.nextInt();

    System.out.println("Computer guesses: "+rnum);

    if(rnum==num)
      System.out.println("You got it right");
    else if(num+1==rnum || num-1==rnum)
      System.out.println("Almost got it");
    else
      System.out.println("You got it wrong");

  }

}
