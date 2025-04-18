
 interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

 class BasicCalculator implements Calculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
public class Main12 {
    public static void main(String[] args) {
        Calculator calc = new BasicCalculator();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Add: " + calc.add(num1, num2));
        System.out.println("Subtract: " + calc.subtract(num1, num2));
        System.out.println("Multiply: " + calc.multiply(num1, num2));
        System.out.println("Divide: " + calc.divide(num1, num2));
    }
}
