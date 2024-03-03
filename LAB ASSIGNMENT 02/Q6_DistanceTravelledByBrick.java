import java.util.*;
public class Q6_DistanceTravelledByBrick {

  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    float sec=sc.nextFloat();
    float dist=0.5f*32.174f*(float)Math.pow(sec, 2);
    System.out.printf("Distance Travelled: %.3f",dist);
  }

}
