import java.util.*;
class Q2_Alice 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("How much ml of water did Alice drink today? : ");
    int x=sc.nextInt();

    if(x >= 5000) 
      System.out.println("Yes, Alice is following doctor’s advice");
    else
      System.out.println("No, Alice is not following doctor’s advice");

  }

}
