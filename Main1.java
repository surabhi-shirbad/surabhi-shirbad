
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Cat extends Animal {

    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Main1{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();

        System.out.println("Animal sound:");
        myAnimal.makeSound(); 

        System.out.println("Cat sound:");
        myCat.makeSound();    
    }
}
