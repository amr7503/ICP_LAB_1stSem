import java.util.Scanner;
public class Q5_LeapYear 
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Input the year : ");
   int year=sc.nextInt();

   System.out.print(year+" is a leap year: ");
   System.out.println((year%4==0 && year%100!=0) || year%400==0);
 }
}
