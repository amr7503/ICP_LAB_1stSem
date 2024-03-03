import java.util.Scanner;;
public class Q4_SumDigits {

  public static void main(String[] args) 
  {
    int n,sum;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a number between 0 and 1000: ");
    n=sc.nextInt();

    sum=n%10;
    n/=10;

    sum+=n%10;
    n/=10;

    sum+=n%10;
    n/=10;

    sum+=n;

    System.out.println("The sum of the digits is "+sum);
  }

}
