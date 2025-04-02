package factory;

abstract class AnimalFactory {
    public abstract Animal factoryMethod();  // Phương thức factory tạo động vật

    public void makeSound() {
        Animal animal = factoryMethod();  // Tạo động vật thông qua phương thức factory
        animal.sound();  // Gọi phương thức sound của động vật
    }
}