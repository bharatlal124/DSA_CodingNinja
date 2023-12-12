// package DSA Coding NInja;

public class CalculatePower {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int smalloutput = power(x, n - 1);
        int output = x * smalloutput;
        return output;

    }

    public static void main(String[] args) {

        System.out.println("5 raised to the power of 3 is: " + power(5, 3));

        int base = 5;
        int exponent = 3;
        int result = 1;

        while (exponent > 0) {
            result = result * base;
            exponent--;
        }
        System.out.println("Result using loop: " + result);
    }
}
