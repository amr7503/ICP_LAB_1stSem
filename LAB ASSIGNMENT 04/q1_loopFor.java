import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third number: ");
        int increment = sc.nextInt();
        
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i+=increment) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of number displayed is " + sum);
    }
}