import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int largest = Math.max(a, Math.max(b, c));
        int secondLargest = a + b + c - largest - Math.min(a, Math.min(b, c));
        
        System.out.println("Largest number: " + largest);
        System.out.println("2nd largest number: " + secondLargest);
    }
}