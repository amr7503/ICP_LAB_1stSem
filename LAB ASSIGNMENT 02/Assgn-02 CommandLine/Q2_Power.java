class Q2_Power
{
  public static void main(String args[])
  {
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);

   int result =(int)Math.pow(a,b);

   System.out.println(a+" raised to the power of "+b+" is "+result);
   }
}