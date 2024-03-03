import java.util.Scanner;
public class Q7_BillPayment
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("No. of units consumed: ");
    int unit=sc.nextInt();
    float price=0,d=0;

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


    System.out.print("Do you want to pay online(y/n): ");
    char ch=sc.next().charAt(0);

    if(ch=='y' || ch=='Y')
      d=0.03f*price;

    System.out.println("Total amount: "+price);
    System.out.println("Discount: "+d);
    System.out.println("Amount payable: "+(price-d));

  }

}

