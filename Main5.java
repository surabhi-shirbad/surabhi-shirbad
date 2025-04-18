// Main.java
class Animal {
    // Method to be overridden
    public void move() {
        System.out.println("The animal moves.");
    }
}

// Subclass Cheetah that overrides move()
class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("The cheetah runs swiftly.");
    }
}

// Main class to test
public class Main5 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Cheetah fastCheetah = new Cheetah();

        System.out.println("Animal movement:");
        genericAnimal.move();    // Outputs "The animal moves."

        System.out.println("Cheetah movement:");
        fastCheetah.move();      // Outputs "The cheetah runs swiftly."
    }
}
