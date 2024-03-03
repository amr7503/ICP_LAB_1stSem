/*
 Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z
 */
public class Q7_SwapUsingThirdVariable 
{
  public static void main(String[] args) 
  {
  int x=3,y=7;
  System.out.println("Before Swapping   x : "+x+"    y :"+y);

  int z=x;
  x=y;
  y=z;
  System.out.println("After  Swapping   x : "+x+"    y :"+y);

  }
}
