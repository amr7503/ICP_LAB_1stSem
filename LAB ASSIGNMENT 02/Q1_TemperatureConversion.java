import java.util.Scanner;
public class Q1_TemperatureConversion {

  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a degree in Fahrenheit: ");
    double fahrenheit,celsius;

    fahrenheit=sc.nextDouble();
    celsius=(fahrenheit-32)*(5.0/9);
    System.out.printf(fahrenheit+" fahrenheit is %.2f Celsius",celsius);

    //System.out.printf("%.2f celsius",celsius);
  }

}
