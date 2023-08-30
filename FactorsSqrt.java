/**
 * The FactorsSqrt class calculates and prints the factors of a given number
 * using the square root
 * method.
 */

public class FactorsSqrt {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(" " + i + " " + n / i);
            }
        }
    }
}
