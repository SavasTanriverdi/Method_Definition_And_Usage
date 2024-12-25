// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Call the methods and display results
        calculator.printGreeting();

        int sum = calculator.add(10, 5);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(10, 5);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(10, 5);
        System.out.println("Product: " + product);

        double quotient = calculator.divide(10, 5);
        System.out.println("Quotient: " + quotient);

        // Demonstrate division by zero
        calculator.divide(10, 0);
    }
}