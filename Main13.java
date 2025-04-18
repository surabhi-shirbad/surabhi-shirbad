
 abstract class AbstractCalculator {
    
   
    public abstract double add(double a, double b);
    public abstract double subtract(double a, double b);
    public abstract double multiply(double a, double b);
    public abstract double divide(double a, double b);
}

 class SimpleCalculator extends AbstractCalculator {

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
public class Main13 {
    public static void main(String[] args) {
        AbstractCalculator calc = new SimpleCalculator();

        double x = 20, y = 4;

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
    }
}
