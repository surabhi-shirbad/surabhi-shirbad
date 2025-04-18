public class Main17 {
    public static void main(String[] args)
    {
      
        try {
            System.out.println("Inside try block");
            int result
                = 10 / 0; 
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: "
                               + e.getMessage());
        }
        finally {
            System.out.println(
                "finally block always execute");
        }
    }
}