
//   Following is the main function we are using internally.
//   Refer this for completing the ComplexNumbers class
import java.util.*;

public class ComplexNumbers {
    // Complete this class
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers Complex) {
        this.real += Complex.real;
        this.imaginary += Complex.imaginary;
    }

    public void multiply(ComplexNumbers Complex) {
        int tempreal = this.real * Complex.real - this.imaginary * Complex.imaginary;
        int tempimaginary = this.real * Complex.imaginary + this.imaginary * Complex.real;
        this.real = tempreal;
        this.imaginary = tempimaginary;
    }

    public void print() {
        System.out.println(real + " + i" + imaginary);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }
    }
}
