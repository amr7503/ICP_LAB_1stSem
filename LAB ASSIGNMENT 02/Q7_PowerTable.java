
public class Q7_PowerTable {

  public static void main(String[] args) {
    int a=1,b=2;
    System.out.println("a\tb\tpow(a,b)");
    System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));

    a++;
    b++;

    System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));

    a+=1;
    b+=1;

    System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));

    a=a+1;
    b=b+1;

    System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));

    ++a;
    ++b;

    System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));

  }

}
