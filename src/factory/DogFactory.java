package factory;

class DogFactory extends AnimalFactory {
    @Override
    public Animal factoryMethod() {
        return new Dog();  // Tạo ra một đối tượng Chó
    }
}