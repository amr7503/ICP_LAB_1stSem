class Q4_SinCos
  {
   public static void main(String args[])
   {
     double t=Double.parseDouble(args[0]);

    double res=Math.cos(Math.toRadians(5*t))+Math.sin(Math.toRadians(7*t));

    System.out.println("Result = "+res);
    }
 }