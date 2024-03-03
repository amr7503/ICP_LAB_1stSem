import java.util.Scanner;
public class Q5_Hemisphere {

  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the radius of the hemisphere : ");
    double radius=sc.nextDouble();
    double surfaceArea=3*Math.PI*Math.pow(radius, 2);
    double volume=(2.0/3)*Math.PI*Math.pow(radius, 3);
    System.out.printf("The surface area of the hemisphere is %.3f \n",surfaceArea);
    System.out.printf("The volume area of the hemisphere is %.3f",volume);

  }

}
