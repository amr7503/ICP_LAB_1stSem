class Q7_ThreeNos
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int c=Integer.parseInt(args[2]);

  System.out.println("The numbers are "+a+","+b+","+c);

  System.out.print("The statement that \"one number is less than or equal to the product of other two\" is ");

  if( a <= (b*c) )
    System.out.println("True");
  else if( b <= (a*c) )
    System.out.println("True");
  else if( c <= (a*b) )
    System.out.println("True");
  else 
    System.out.println("False");

    }
}