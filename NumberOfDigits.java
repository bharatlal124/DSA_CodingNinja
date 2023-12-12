// package DSA Coding NInja;

public class NumberOfDigits {

    public static int count(int n) {
        if (n == 0)
            return 0;
        int smalloutput = count(n / 10);
        int output = smalloutput + 1;
        return output;
    }

    public static void main(String[] args) {
        int val = 125;
        System.out.println("Number of digits in " + val + " is: " + count(val));
    }
}
