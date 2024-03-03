import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    remainder();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue (Y/N)? ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }

    static void add() {
        // Write code for addition here
    }

    static void sub() {
        // Write code for subtraction here
    }

    static void mul() {
        // Write code for multiplication here
    }

    static void div() {
        // Write code for division here
    }

    static void remainder() {
        // Write code for remainder here
    }
}