import java.util.Scanner;
public class Q3_Salary {

  public static void main(String[] args) 
  {
    double basicSalary,hra,da,gross;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter basic salary: ");
    basicSalary=sc.nextDouble();

    da=0.4*basicSalary;
    hra=0.2*basicSalary;
    gross=basicSalary+hra+da;

    System.out.print("DA is "+da+"\nHRA is "+hra+"\nGross Salary is "+gross);
  }

}
