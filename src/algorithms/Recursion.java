package algorithms;

public class Recursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // Base case: factorial of 0 is 1
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // Calling the factorial method with 5
        System.out.println("Factorial of 5 is: " + result); // Output the result
    }
}
