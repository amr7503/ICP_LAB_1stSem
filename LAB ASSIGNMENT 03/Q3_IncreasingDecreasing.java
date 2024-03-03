import java.util.*;
public class Q3_IncreasingDecreasing 
{
  public static void main(String[] args) 
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three numbers : ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    if(a<b && b<c)
    {
      System.out.println("Increasing");
    }
    else if(a>b && b>c)
    {
      System.out.println("Decreasing");
    }
    else
    {
      System.out.println("Neither Increasing nor decreasing");
    }
  }

}
