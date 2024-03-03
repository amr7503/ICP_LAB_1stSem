public class DivisibleByNine {
    public static void main(String[] args) {
        int n = 123456; // Replace with the desired number

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 9 == 0) {
            System.out.println("The number is divisible by 9");
        } else {
            System.out.println("The number is not divisible by 9");
        }
    }
}