import java.util.*;
public class Q1_EligibleToVoteOrNot 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age=sc.nextInt();

    if(age>=18) 
      System.out.println("You are eligible to cast your vote");
    else
      System.out.println("Sorry , You are not eligible to cast your vote");

  }

}
