import java.util.*;
public class Q6_ElectricityBill 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter yout units: ");
    int unit=sc.nextInt();
    float price=0;

    if(unit<=50)
    {
      price=unit*3;
    }
    else if(unit<=200)
    {
      price=150+(unit-50)*4.8f;
    }
    else if(unit<=400)
    {
      price=870+(unit-200)*5.8f;
    }
    else
    {
      price=2030+(unit-400)*6.2f;
    }

    System.out.println("Your Electricity Bill is Rs."+price);

  }

}
