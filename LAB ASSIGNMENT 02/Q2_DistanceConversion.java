import java.util.Scanner;
public class Q2_DistanceConversion 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the distance in km=");
    int km=sc.nextInt();

    int meter=km*1000;
    double feet=km*3280.8399;
    double inch=km*39370.0787;
    int centi=km*100000;
    System.out.println(km+" km is "+meter+" meters");
    System.out.println(km+" km is "+feet+" feet");
    System.out.println(km+" km is "+inch+" inch");
    System.out.println(km+" km is "+centi+" centimetres");
  }
}
