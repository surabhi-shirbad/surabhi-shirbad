
class Shape {
    
    public double getArea() {
        System.out.println("Area of shape is undefined.");
        return 0;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}


public class Main3 {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        Shape myRectangle = new Rectangle(5, 3); 
        System.out.println("Shape area:");
        myShape.getArea();

        System.out.println("Rectangle area:");
        System.out.println(myRectangle.getArea()); 
    }
}
