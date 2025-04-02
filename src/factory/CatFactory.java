package factory;

class CatFactory extends AnimalFactory {
    @Override
    public Animal factoryMethod() {
        return new Cat();  // Tạo ra một đối tượng Mèo
    }
}