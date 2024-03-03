import java.util.Scanner;

public class CartesianPlane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("(" + x + ", " + y + ") is at the origin");
        } else if (x == 0) {
            System.out.println("(" + x + ", " + y + ") is on the y-axis");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ") is on the x-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant IV");
        }
    }
}