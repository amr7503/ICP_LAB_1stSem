import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();

        int sum = 0;
        int counter = 0;
        do {
            int rand = (int)(Math.random() * N) + 1;
            System.out.print(rand + " ");
            sum += rand;
            counter++;
        } while (counter < N);

        System.out.println("\nAverage of " + N + " random numbers is " + (double) sum / N);
    }
}