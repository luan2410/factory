package factory;

public class Main {
    public static void main(String[] args) {
        // Tạo nhà máy Chó và gọi âm thanh
        AnimalFactory dogFactory = new DogFactory();
        dogFactory.makeSound();  // Output: Woof! Woof!

        // Tạo nhà máy Mèo và gọi âm thanh
        AnimalFactory catFactory = new CatFactory();
        catFactory.makeSound();  // Output: Meow! Meow!
    }
}