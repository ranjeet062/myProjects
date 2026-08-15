package org.sample;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Calculate (a + b)
        int sum = a + b;

        // Calculate (a + b)^2 which is sum * sum
        int result = sum * sum;
        // Alternatively, you can directly calculate: int result = (a + b) * (a + b);

        // Print the results
        System.out.println("Given a = " + a);
        System.out.println("Given b = " + b);
        System.out.println("(a + b)^2 = (" + a + " + " + b + ")^2");
        System.out.println("(a + b)^2 = (" + sum + ")^2");
        System.out.println("(a + b)^2 = " + result);

        // You can also demonstrate the expansion a^2 + 2ab + b^2
        int a_square = a * a;
        int b_square = b * b;
        int two_ab = 2 * a * b;
        int expanded_result = a_square + two_ab + b_square;

        System.out.println("\nVerifying with a^2 + 2ab + b^2:");
        System.out.println("a^2 = " + a_square);
        System.out.println("b^2 = " + b_square);
        System.out.println("2ab = " + two_ab);
        System.out.println("a^2 + 2ab + b^2 = " + expanded_result);

        // The results should be the same
        if (result == expanded_result) {
            System.out.println("Both methods yield the same result.");
        }
    }
}
