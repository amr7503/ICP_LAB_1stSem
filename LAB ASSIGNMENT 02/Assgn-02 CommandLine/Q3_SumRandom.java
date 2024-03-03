class Q3_SumRandom
{
  public static void main(String args[])
  {
    int a=(int)(Math.random()*6+1);
    int b=(int)(Math.random()*6+1);

    int sum=a+b;

    System.out.println("Random numbers generated between 1-6 are "+a+" & "+b+" and their sum is "+sum);
   }
 }  